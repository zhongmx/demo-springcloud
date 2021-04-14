package com.fengabner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: zmx
 * @create: 2021/04/14 17:13
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/remote-request")
    public String getRemoteRequest() {
        String url = "http://DEMO-USER-PROVIDER-SERVER/hello/get";

        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
    }
}
