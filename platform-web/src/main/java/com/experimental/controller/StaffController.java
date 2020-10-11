package com.experimental.controller;

import com.experimental.http.HttpResult;
import com.experimental.page.PageRequest;
import com.experimental.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest){
        return HttpResult.success(staffService.findPage(pageRequest));
    }
}
