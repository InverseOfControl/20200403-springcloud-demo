package com.ghx.springcloud.demorabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void reveice(String msg) {
        System.out.printf("Receiver : " + msg + "\n");
    }

}
