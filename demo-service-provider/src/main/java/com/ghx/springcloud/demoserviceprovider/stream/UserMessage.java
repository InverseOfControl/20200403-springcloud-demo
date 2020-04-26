package com.ghx.springcloud.demoserviceprovider.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserMessage {

    @Input
    public SubscribableChannel input();

}
