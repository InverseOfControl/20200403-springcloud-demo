package com.ghx.springcloud.demorabbitmq;

import com.ghx.springcloud.demorabbitmq.stream.UserMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(UserMessage.class)
public class DemoRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRabbitmqApplication.class, args);
    }

}
