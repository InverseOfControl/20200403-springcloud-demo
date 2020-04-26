1.消息代理（Message Broker）
    将消息路由到一个或多个目的地
    消息转化为其它的表现形式
    执行消息的聚合、分解，并将结果发送到它们的目的地，然后重新组合响应返回给消息用户
    调用 Web 服务来检索数据
    响应事件或错误
    使用发布-订阅的模式来提供内容或基于主题的消息路由

2.如果通过 Spring Cloud Bus 来实现以消息总线的方式进行配置变更的通知，并完成集群上的批量配置更新

3.RabbitMQ
3.1 基本概念
    Broker：消息队列服务器的实体，负责接收消息和发送消息
    Exchange：消息交换机，是消息第一个到达的地方，消息通过它指定的路由规则分发到不同的消息队列中去
    Queue：消息队列，消息最终到达的地方
    Binding：是 Exchange 和 Queue 之间的桥梁。把 Exchange 和 Queue 按照路由规则绑定起来，是一个虚拟连接
    Routing Key：路由关键字，Exchange 根据这个关键字进行消息投递
    Virtual host：虚拟主机，它是对 Broker 的虚拟划分。可以在一个 Broker 中设置多个虚拟主机
    Connection：连接，代表生产者、消费者、Broker 之间进行通信的物理网络
    Channel：消息通道。每个 Channel 代表依次回话。
    Producer：消息生产者
    Consumer：消息消费者

 4.整合 Spring Cloud Bus
    a.引入包-spring-cloud-starter-bus-amqp 
    b.暴露端点-management.endpoints.web.exposure.include=env,refresh,beans,bus-refresh,bus-env
    c.修改 Git 配置信息
    d.postman-http://localhost:7776/actuator/bus-refresh
    