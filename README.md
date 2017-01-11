# git项目在Eclipse中的部署

	Git是一个开源的分布式版本控制系统，可以有效、高速的处理从很小到非常大的项目版本管理。
	为便于开发人员快速上手git，编写以下步骤以供参考.


## 前置条件

* [安装maven](http://maven.apache.org/)
* 安装Eclipse
	* [安装Eclipse for MAC](ftp://ftpuser@192.168.3.170/01.Software/02.Mac.software/eclipse-inst-mac64.tar.gz)
	* [安装Eclipse for windows](http://www.eclipse.org/downloads/)
* [下载tomcat](ftp://ftpuser@192.168.3.170/01.Software/apache-tomcat-8.0.33.zip)

## 过程

* 打开git视图： 首先需要将git视图拉出来显示，点击Window-->Show View-->Git-->Git Repositories
* 下载代码： 复制项目存储库链接http://gitlab.apitops.com/broker/JavaBrokerService.git，在Git Repositories视图中右键点击Paste Repository Path and URI, 输入“User”、“Password”，然后按照步骤以及自己的方式下一步进行即可。clone完成后就可以在Git Repositories视图中查看到相应的源代码。
* 导入项目： 点击Eclipse中File-->import-->Existing Maven Projects,会看到三个项目，确定导入。
* 构建项目： 右键JavaBrokerService项目，Run As -> Maven install
* 部署并运行： 将项目引入tomcat中，启动tomcat

## 验证
服务器起来后, 访问 [http://localhost:8080/BrokerService/v4/health/res1](http://localhost:8080/BrokerService/v4/health/res1)
如果你看到页面出现hello world! Connection: keep-alive，恭喜你。

## 更多 JAX-RS 2.0 介绍
* [JSR 339规范: JAX-RS 2.0](https://jcp.org/en/jsr/detail?id=339)
* [Apache CXF 文档](http://cxf.apache.org/docs/index.html)


````