package com.ghx.springcloud.democonfigclient.observer;

public class DemoObserverTest {
    public static void main(String[] args) {
        DemoPublisher demoPublisher = new DemoPublisher();

        DemoSubscriber subscriberOne =new DemoSubscriber();
        DemoSubscriber subscriberTwo =new DemoSubscriber();
        demoPublisher.addSubscriber(subscriberOne);
        demoPublisher.addSubscriber(subscriberTwo);

        demoPublisher.publish();
    }
}
