package com.tops001.common;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/7/26.
 */
@Service
public class RedisUtils {
    @Autowired
    @Qualifier(value = "redisTemplate")
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 判断key值是否存在
     *
     * @param key
     * @return
     */
    public Boolean exists(String key) {
        return StringUtils.isBlank(get(key));
    }

    /**
     * 设值
     *
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        getkeyOps(key).set(value);
    }

    /**
     * 获取值
     *
     * @param key
     * @return
     */
    public String get(String key) {
        return getkeyOps(key).get();
    }

    public Set<String> SetKeys (String pattern){
        return redisTemplate.keys(pattern);
    }

    /**
     * 设值，并设定有效期
     *
     * @param key
     * @param value
     * @param unit 时间单位
     * @param timeout 有效期
     */
    public void set(String key, String value, TimeUnit unit, long timeout) {
        BoundValueOperations<String, String> valueOps = getkeyOps(key);
        valueOps.set(value, timeout, unit);
    }

    /**
     * 删除单个key
     *
     * @param key
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    /**
     * 批量删除key
     *
     * @param keys
     */
    public void delete(Collection<String> keys) {
        redisTemplate.delete(keys);
    }

    private BoundValueOperations<String, String> getkeyOps(String key) {
        return redisTemplate.boundValueOps(key);
    }
}
