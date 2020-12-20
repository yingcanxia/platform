package com.experimental.controller;

import com.experimental.req.service.PlatformProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {

    @Autowired
    private PlatformProducerService platformProducerService;


    @RequestMapping("/feign/hello")
    public String call(){
        return platformProducerService.hello();
    }

}
