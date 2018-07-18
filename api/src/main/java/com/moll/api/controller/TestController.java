package com.moll.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：测试Controller
 *
 * @author: zhangzy
 * @create: 2018-07-18
 */

@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort ;

    @GetMapping("/test/port")
    public String printServerport(@RequestParam String name){
        System.out.println("user");
        return "User Name :" + name + " , it's port is :" + serverPort;
    }
}
