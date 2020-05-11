package com.controller;

import org.springframework.http.ResponseCookie;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public Object login(ServerHttpResponse response){
        //登录校验。。。
//        Cookie
//        ResponseCookie
        response.addCookie(ResponseCookie.from("login1","user-1").build());
        return "登录成功";
    }
}
