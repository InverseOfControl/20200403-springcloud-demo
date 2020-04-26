1.Config Server每次通过http://localhost:9000/demo-config-client/dev从Git上拉取配置信息的时候，都会缓存
最新的配置到本地，然后在本地Git中读取并返回。控制台日志信息：
Adding property source: file:/C:/Users/ADMINI~1/AppData/Local/Temp/config-repo-6388086967830839512/demo-config-client-dev.properties
Adding property source: file:/C:/Users/ADMINI~1/AppData/Local/Temp/config-repo-6388086967830839512/demo-config-client.properties

2.属性覆盖
spring.cloud.config.server.ovvrrides.name=didi
spring.cloud.config.server.ovvrrides.name=shanghai

3.安全保护

4.高可用配置
通过 Eureka 实现


