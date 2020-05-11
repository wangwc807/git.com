package com.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {


    @RequestMapping("/getUser")
    public Object getUser(){
        System.out.println(1);
        return "user";
    }
}
