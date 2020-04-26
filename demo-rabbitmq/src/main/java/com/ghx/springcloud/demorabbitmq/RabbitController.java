package com.ghx.springcloud.demorabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    @Autowired
    private Sender sender;

    @GetMapping("/send")
    public void send() {
        sender.send();
    }
}
