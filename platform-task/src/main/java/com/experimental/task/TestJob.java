package com.experimental.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import org.springframework.stereotype.Service;

@Service
public class TestJob extends IJobHandler {

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        System.out.println("hello world");
        return ReturnT.SUCCESS;
    }
}
