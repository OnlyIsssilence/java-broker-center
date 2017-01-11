package com.tops001.common;

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.tops001.core.utils.PropertyConfigurer;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/7/26.
 */
public class MongoDbAliYunUtil {
    protected static Logger logger = LoggerFactory.getLogger("MongoDbUtil");

    private static MongoClient mongoClient = null;
    private static MongoDatabase mongoDatabase = null;
    private static MongoCollection mongoCollection = null;

    private static final String serverIps = PropertyConfigurer.getProperty("aliyun.mongodb.ips");
    private static final int serverPort = Integer.valueOf(PropertyConfigurer.getProperty("aliyun.mongodb.port"));

    private static final String defaultDbName = PropertyConfigurer.getProperty("aliyun.mongodb.defaultDbName");
    private static final String useDbName = PropertyConfigurer.getProperty("aliyun.mongodb.useDbName");
    private static final String useCollectionName = PropertyConfigurer.getProperty("aliyun.mongodb.useCollectionName");
    private static final String defaultDbUserName = PropertyConfigurer.getProperty("aliyun.mongodb.username");
    private static final String defaultDbPassWord = PropertyConfigurer.getProperty("aliyun.mongodb.password");
    private static final String replSetName = PropertyConfigurer.getProperty("aliyun.mongodb.replsetname");

    private static final int maxActive = Integer.valueOf(PropertyConfigurer.getProperty("write.mongodb.maxActive"));
    private static final int connectTimeOut = Integer.valueOf(PropertyConfigurer.getProperty("write.mongodb.timeout"));
    private static final int connectWaitTime = Integer.valueOf(PropertyConfigurer.getProperty("write.mongodb.maxWait"));
    private static final int connectSocketTimeOut = Integer.valueOf(PropertyConfigurer.getProperty("write.mongodb.socketTimeout"));
    private static final int threadsNum = Integer.valueOf(PropertyConfigurer.getProperty("write.mongodb.threadsNum"));


    private static Map<String, MongoCollection> dbCollectionMap = new ConcurrentHashMap<>();

    //单个实例
    private static MongoDbAliYunUtil mongoDbUtil = null;
    private MongoDbAliYunUtil(){

    }

    public static MongoDbAliYunUtil GetMongoInstance(){
        if(mongoDbUtil == null){
            mongoDbUtil = new MongoDbAliYunUtil();
        }
        return mongoDbUtil;
    }

    /**
     * 连接服务器
     */
    static {
        try{
            createMongoDBClient();
        }
        catch (MongoException e){
            logger.error(e.toString());
            logger.error("连接mongoDb失败, 服务器地址: " + serverIps + ", 端口: " + serverPort);
            e.printStackTrace();
        }
    }

    public static MongoClient createMongoDBClient() {
        // 构建Seed列表
        List<ServerAddress> seedList = new ArrayList<ServerAddress>();
        String[] serverIpList = serverIps.split(";");
        for(String serverIp : serverIpList){
            ServerAddress serverAddress = new ServerAddress(serverIp, serverPort);
            seedList.add(serverAddress);
        }

        // 构建鉴权信息
        List<MongoCredential> credentials = new ArrayList<MongoCredential>();
        credentials.add(MongoCredential.createScramSha1Credential(defaultDbUserName,
                defaultDbName, defaultDbPassWord.toCharArray()));

        // 构建操作选项，requiredReplicaSetName属性外的选项根据自己的实际需求配置，默认参数满足大多数场景
//        MongoClientOptions options = MongoClientOptions.builder()
//                .requiredReplicaSetName(replSetName).socketTimeout(2000)
//                .connectionsPerHost(1).build();

        /**
         * mongodb 配置参数
         */
        MongoClientOptions.Builder options = new MongoClientOptions.Builder();
        // 连接池设置为300个连接，默认为100个连接
        options.connectionsPerHost(maxActive);
        // 连接超时，推荐>3000毫秒
        options.connectTimeout(connectTimeOut);
        options.maxWaitTime(connectWaitTime);
        // 套接字超时时间，0无限制
        options.socketTimeout(connectSocketTimeOut);
        // 线程队列数，如果连接线程排满了队列就会抛出“Out of semaphores to get db”错误。
        options.threadsAllowedToBlockForConnectionMultiplier(threadsNum);
        options.writeConcern(WriteConcern.SAFE);
        if(!"".equals(replSetName)){
            options.requiredReplicaSetName(replSetName);
        }
        options.build();

        mongoClient = new MongoClient(seedList, credentials);

        mongoDatabase = mongoClient.getDatabase(useDbName);
        mongoCollection = mongoDatabase.getCollection(useCollectionName);

        return mongoClient;
    }

    public static MongoClient createMongoDBClientWithURI() {
        String connectUri = "mongodb://" + defaultDbUserName + ":" + defaultDbPassWord + "@";
        // 构建Seed列表
        String[] serverIpList = serverIps.split(";");
        if(serverIpList.length > 0){
            for(String serverIp : serverIpList){
                ServerAddress serverAddress = new ServerAddress(serverIp, serverPort);
                connectUri += serverAddress + ",";
            }
            connectUri = connectUri.substring(0, connectUri.length() - 1);
        }

        connectUri += "/" + defaultDbName;
        if(!"".equals(replSetName)){
            connectUri += "?replicaSet=";
        }

        //另一种通过URI初始化
        //mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]
        MongoClientURI connectionString = new MongoClientURI(connectUri);
        return new MongoClient(connectionString);
    }

    /**
     * 获取数据库连接
     * @param dbName 数据库名
     * @return 成功返回true
     */
    public MongoDatabase getDataBase(String dbName){
        try {
            if (dbName != null && !"".equals(dbName)){
                return mongoClient.getDatabase(dbName);
            }else{
                return mongoDatabase;
            }
        }
        catch (Exception e){
            logger.error(e.toString());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 关闭数据库连接
     */
    public void close(){
        if(mongoClient != null){
            mongoClient.close();
            mongoClient = null;
        }
    }

    /**
     * 获取指定的集合
     * @param dbName 数据名称
     * @param collectionName 集合名称 默认为配置文件中名称
     * @return 返回获取到的集合
     */
    public MongoCollection<Document> getCollection(String dbName, String collectionName){
        MongoCollection dbCollection = null;
        MongoDatabase mongoDb = null;
        if(collectionName == null || collectionName == ""){
            collectionName = useCollectionName;
        }
        if(dbName == null || dbName == ""){
            mongoDb = mongoDatabase;
        }
        else{
            mongoDb = getDataBase(dbName);
        }

        dbCollection = mongoDb.getCollection(collectionName);

        return dbCollection;
    }

    /**
     * 获取指定的集合
     * @param collectionName 集合名称 默认为配置文件中名称
     * @return 返回获取到的集合
     */
    public MongoCollection<Document> getCollection(String collectionName){
        MongoCollection dbCollection = null;
        if(collectionName == null || collectionName == ""){
            collectionName = useCollectionName;
        }
        if(dbCollectionMap.containsKey(collectionName)){
            dbCollection = dbCollectionMap.get(collectionName);
        }else{
            dbCollection = this.mongoDatabase.getCollection(collectionName);
            if(dbCollection != null){
                dbCollectionMap.put(collectionName, dbCollection);
            }
        }

        return dbCollection;
    }


    /**
     * 查询Db数据库下面的所有表名
     * @param dbName 数据库名称 没有为配置文件
     * @return
     */
    public List<String> getAllCollections(String dbName){
        MongoIterable<String> collections = getDataBase(dbName).listCollectionNames();
        List<String> resultList = new ArrayList<>();
        for(String item : collections){
            resultList.add(item);
        }
        return resultList;
    }

    /**
     * 获取所有数据库名称列表
     * @return 数据名称列表
     */
    public List<String> getAllDBNames(){
        List<String> resultList = new ArrayList<>();
        MongoIterable<String> dbs = mongoClient.listDatabaseNames();
        for(String item : dbs){
            resultList.add(item);
        }
        return resultList;
    }

    /**
     * 删除一个数据库
     * @param dbName 数据库名称
     */
    public void dropDB(String dbName){
        getDataBase(dbName).drop();
    }


    /**
     * 判断是否存在文档
     * @param collectionName 文档名称
     * @param queryParam 查询条件
     * @return true 存在
     */
    public boolean exsitDocument(String collectionName, Map<String, String> queryParam){
        boolean result = false;
        MongoCollection dbCollection = getCollection(collectionName);
        MongoCursor dbCursor = null;
        FindIterable findIterable = null;
        if(dbCollection != null){
            findIterable = dbCollection.find(new BasicDBObject(queryParam));
            dbCursor = findIterable.iterator();
            if(dbCursor != null && dbCursor.hasNext()){
                result = true;
                dbCursor.close();
            }
        }
        return result;
    }

    /**
     * 根据条件查询第一条记录
     * @param collectionName 集合名称 默认为配置文件中的集合
     * @param queryParam 查询条件
     * @return MongoCursor 迭代器
     */
    public Document findOne(String collectionName, Map<String, String> queryParam){
        MongoCollection<Document> dbCollection = getCollection(collectionName);
        Document result = null;
        FindIterable<Document> findIterable = null;
        if(dbCollection != null){
            result = dbCollection.find(new BasicDBObject(queryParam)).first();
        }
        return  result;
    }

    /**
     * 根据条件查询第一条记录
     * @param collectionName 集合名称 默认为配置文件中的集合
     * @param queryParam 查询条件
     * @return MongoCursor 迭代器
     */
    public Document findOne(String dbName, String collectionName, Map<String, String> queryParam){
        MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
        Document result = null;
        FindIterable<Document> findIterable = null;
        if(dbCollection != null){
            result = dbCollection.find(new BasicDBObject(queryParam)).first();
        }
        return  result;
    }

    /**
     * 查找对象 - 根据主键_id
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中的名称
     * @param id 文档主键
     * @return 数据库文档
     */
    public Document findById(String dbName, String collectionName, String id){
        ObjectId objId = null;
        try{
            objId = new ObjectId(id);
        }
        catch (Exception e){
            return null;
        }
        Document result = getCollection(dbName, collectionName).find(Filters.eq("_id", objId)).first();
        return result;
    }

    /**
     * 统计数
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中的名称
     * @return 集合数
     */
    public long getCount(String dbName, String collectionName){
        return getCollection(dbName, collectionName).count();
    }


    /**
     * 根据条件查询记录
     * @param collectionName 集合名称 默认为配置文件中的集合
     * @param queryParam 查询条件
     * @return MongoCursor 游标
     */
    public MongoCursor<Document> find(String collectionName, Map<String, String> queryParam){
        MongoCollection dbCollection =getCollection(collectionName);
        MongoCursor<Document> mongoCursor = null;
        FindIterable<Document> findIterable = null;
        if(dbCollection != null){
            findIterable = dbCollection.find(new BasicDBObject(queryParam));
            mongoCursor = findIterable.iterator();
        }
        return  mongoCursor;
    }

    /**
     * 根据条件查询记录
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认为配置文件中的集合
     * @param filter 过滤条件
     * @return MongoCursor 游标
     */
    public MongoCursor<Document> find(String dbName, String collectionName, Bson filter){
        MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);

        return dbCollection.find(filter).iterator();
    }

    /**
     * 执行命令行查询记录
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param filter 过滤条件
     * @return MongoCursor 游标
     */
    public Document findByCommand(String dbName, Bson filter){
        MongoDatabase db = getDataBase(dbName);

        return db.runCommand(filter);
    }

    /**
     * 分页查询
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中的名称
     * @param filter 过滤条件
     * @param pageNo 页码
     * @param pageSize 页大小
     * @return
     */
    public MongoCursor<Document> findByPage(String dbName, String collectionName, Bson filter, int pageNo, int pageSize){
        MongoCollection<Document> dbCollection = getCollection(dbName, collectionName);
        Bson orderBy = new BasicDBObject("_id", 1);

        return dbCollection.find(filter).sort(orderBy).skip((pageNo - 1) * pageSize).limit(pageSize).iterator();
    }

    /**
     * 插入一个文档到集合中
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param insertParam 要插入的文档
     */
    public void insertOne(String dbName,String collectionName, Map<String, String> insertParam){
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        if(dbCollection != null){
            dbCollection.insertOne(insertParam);
        }
    }

    /**
     * 插入一个文档到集合中
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param doc 要插入的文档
     */
    public void insertOne(String dbName,String collectionName, Document doc){
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        if(dbCollection != null){
            dbCollection.insertOne(doc);
        }
    }

    /**
     * 插入文档列表到集合中
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param insertParams 文档列表
     */
    public void insertManyByMapList(String dbName, String collectionName, List<Map<String, String>> insertParams){
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        if(dbCollection != null){
            dbCollection.insertMany(insertParams);
        }
    }

    /**
     * 插入文档列表到集合中
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param docs 文档列表
     */
    public void insertMany(String dbName, String collectionName, List<Document> docs){
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        if(dbCollection != null){
            dbCollection.insertMany(docs);
        }
    }

    /**
     * 通过ID删除
     * @param dbName  数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param id 文档主键
     * @return
     */
    public long deleteById(String dbName, String collectionName, String id){
        long count = 0;
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        ObjectId objId = null;
        try {
            objId = new ObjectId(id);
        }
        catch (Exception e){
            return count;
        }
        Bson filter = Filters.eq("_id", objId);
        DeleteResult deleteResult = dbCollection.deleteOne(filter);
        count = deleteResult.getDeletedCount();
        return count;
    }

    /**
     * 根据条件删除
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param filter 查询条件
     * @return
     */
    public long delete(String dbName, String collectionName, Bson filter){
        long count = 0;
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        DeleteResult deleteResult = dbCollection.deleteMany(filter);
        count = deleteResult.getDeletedCount();
        return count;
    }

    /**
     * 根据主键Id 更新文档
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param id 主键
     * @param newDoc 新文档
     * @return
     */
    public long updateById(String dbName, String collectionName, String id, Document newDoc){
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        ObjectId objId = null;
        try {
            objId = new ObjectId(id);
        }
        catch (Exception e){
            return 0;
        }
        Bson filter = Filters.eq("_id", objId);
        UpdateResult updateResult = dbCollection.updateOne(filter, new Document("$set", newDoc));
        return updateResult.getModifiedCount();
    }

    /**
     * 根据条件更新文档
     * @param dbName 数据库名称 默认配置文件中的名称
     * @param collectionName 集合名称 默认配置文件中
     * @param filter 查询条件
     * @param newDoc 新文档
     * @return
     */
    public long update(String dbName, String collectionName, Bson filter, Document newDoc){
        MongoCollection dbCollection =getCollection(dbName, collectionName);
        UpdateResult updateResult = dbCollection.updateMany(filter, new Document("$set", newDoc));
        return updateResult.getModifiedCount();
    }
}
