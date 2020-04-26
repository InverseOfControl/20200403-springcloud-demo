package com.ghx.springcloud.democonfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${name}")
    private String name;

    @Autowired
    private Environment environment;

    @GetMapping("/demo")
    public String demo(){
        return name + "==" + environment.getProperty("name");
    }
}
