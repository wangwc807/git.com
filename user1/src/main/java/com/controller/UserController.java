package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public Object getUser(){
        System.out.println(1);
        return "user1";
    }
}
