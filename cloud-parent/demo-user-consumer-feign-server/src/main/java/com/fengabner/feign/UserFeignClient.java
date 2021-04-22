package com.fengabner.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: zmx
 * @create: 2021/04/22 14:11
 * @description:
 */
@FeignClient(name = "demo-user-provider-server")
public interface UserFeignClient {

    @RequestMapping(value = "/user/info",method = RequestMethod.GET)
    String getUser();
}
