package com.fengabner.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zmx
 * @create: 2021/04/22 14:12
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/info")
    public String getUser(){
        //throw new RuntimeException();
        return "zmx, from user provider server 2";
    }
}
