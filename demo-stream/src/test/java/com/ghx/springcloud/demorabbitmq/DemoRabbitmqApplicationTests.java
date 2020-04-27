package com.ghx.springcloud.demorabbitmq;

import com.ghx.springcloud.demorabbitmq.stream.UserMessageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoRabbitmqApplicationTests {

    @Autowired
    private UserMessageService userMessageService;

    @Test
    void send() {
        userMessageService.send();
    }

}
