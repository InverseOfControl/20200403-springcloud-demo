package com.ghx.springcloud.demorabbitmq.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

@Service
public class UserMessageService {

    @Autowired
    private UserMessage userMessage;

    public void send() {
        MessageChannel messageChannel = userMessage.userMessageOut();

        GenericMessage<String> message = new GenericMessage<>("abc123");
        messageChannel.send(message);
    }

    @StreamListener("user-message-in")
    public void receive(byte[] data) {
        String message = new String(data);
        System.out.println(message);
    }

}
