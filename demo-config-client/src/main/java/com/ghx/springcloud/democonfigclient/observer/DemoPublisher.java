package com.ghx.springcloud.democonfigclient.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoPublisher {

    private List<DemoSubscriber> subscriberList = new ArrayList<DemoSubscriber>();

    public void addSubscriber(DemoSubscriber demoSubscriber) {
        subscriberList.add(demoSubscriber);
    }

    public void publish() {
        for (DemoSubscriber demoSubscriber : subscriberList) {
            demoSubscriber.recieve("滴滴滴");
        }
    }
}
