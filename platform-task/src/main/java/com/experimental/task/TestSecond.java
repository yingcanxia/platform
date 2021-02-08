package com.experimental.task;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestSecond {

    private Logger logger = LoggerFactory.getLogger(TestSecond.class);

    @XxlJob(value = "secondJob")
    public void secondJob () throws Exception{
        logger.info("XXL-JOB, Hello World.");

    }

}
