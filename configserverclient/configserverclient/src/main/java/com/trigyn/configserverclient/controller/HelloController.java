package com.trigyn.configserverclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String userPort;
    @Value("${user.name.name}")
    private String userName;
    @GetMapping("/getPort")
    public String getUserPort(){
        return userPort;
    }

    @GetMapping("/getName")
    public String getUserName(){
        return userName;
    }
}
