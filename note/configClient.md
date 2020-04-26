1.因为客户端应用在获取外部化配置的优先级高于本地Jar包中的配置信息，所以Jar包中重复的配置信息将不再被加载。
并且配置信息必须在bootstrap.properteis文件中配置。

2.服务化配置中心
之前我们是通过 spring.cloud.config.label.uri 来直接连接 config server 获取配置信息。
现在我们通过注册中心来获取 config server 的配置信息，也就是通过 config server 的应用
名称来获取配置信息，如下：
spring.cloud.config.discovery.enabled=true
spring.cloud.config.discovery.service-id=demo-config-server

3.失败快速响应与重试
spring.cloud.config.failFast=true

4.动态刷新配置
    添加依赖 spring-boot-starter-actuator
    开启 refresh 端点
    通过 http://localhost:7777/actuator/refresh 调用
5.

