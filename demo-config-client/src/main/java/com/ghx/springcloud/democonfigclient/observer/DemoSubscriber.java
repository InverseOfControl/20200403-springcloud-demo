package com.ghx.springcloud.democonfigclient.observer;

public class DemoSubscriber {

    public void recieve(Object o) {
        System.out.println("监听到服务端的信息：" + o);
    }

}
