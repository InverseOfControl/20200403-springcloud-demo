package com.ghx.springcloud.demorabbitmq.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface UserMessage {

    @Output("user-message-out")
    MessageChannel userMessageOut();

    @Input("user-message-in")
    SubscribableChannel userMessageIn();
}
