package com.experimental.hystrix;

import com.experimental.req.service.PlatformProducerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class PlatformProducerHystrix implements PlatformProducerService {


    @RequestMapping("/hello")
    @Override
    public String hello() {
        return "sorry, hello service call failed";
    }
}
