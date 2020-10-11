package com.experimental.controller;

import com.experimental.maindata.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.experimental.userService.IUserService;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MyController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/aaa")
    public List<Staff> aaa(){
        return userService.selectAll();
    }
}
