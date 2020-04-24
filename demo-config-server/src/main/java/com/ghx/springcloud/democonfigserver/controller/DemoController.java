package com.ghx.springcloud.democonfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //@Value("${dev.name}")
    private String name;

    @GetMapping("/demo")
    public String demo(){
        return "hello ";
    }
}
