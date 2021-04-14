package com.fengabner.demouserproviderserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zmx
 * @create: 2021/04/14 16:58
 * @description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/get")
    public String hello() {
        return "user provider server 1";
    }
}