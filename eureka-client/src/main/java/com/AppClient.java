package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 需要视频资料或咨询课程的同学可以添加若曦老师的QQ:2746251334
 */
@SpringBootApplication
@EnableEurekaClient
public class AppClient {

    public static void main(String[] args) {
        SpringApplication.run(AppClient.class);
    }
}
