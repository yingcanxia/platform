package com.experimental.req.service;

import com.experimental.hystrix.PlatformProducerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(fallback = PlatformProducerHystrix.class)
public interface PlatformProducerService {

    @RequestMapping("/hello")
    String hello();
}
