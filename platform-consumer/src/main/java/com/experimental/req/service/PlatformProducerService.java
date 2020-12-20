package com.experimental.req.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient
public interface PlatformProducerService {

    @RequestMapping("/hello")
    public String hello();
}
