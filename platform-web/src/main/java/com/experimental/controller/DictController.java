package com.experimental.controller;

import com.experimental.dict.sercice.IMainDictService;
import com.experimental.http.HttpResult;
import com.experimental.maindata.model.MainDict;
import com.experimental.page.PageRequest;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dict")
@Api(value = "字段管理接口",tags = {"字典管理接口"},produces = "application/json", consumes = "application/json", protocols = "http")
public class DictController {

    @Autowired
    private IMainDictService mainDictService;

    @PreAuthorize("hasAuthority('sys:dict:add') and hasAuthority('sys:dict:edit')")
    @PostMapping("/save")
    public HttpResult save(@RequestBody MainDict mainDict){
        mainDictService.save(mainDict);
        return HttpResult.success("添加成功");
    }

    @PreAuthorize("hasAuthority('sys:dict:view')")
    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest){
        return HttpResult.success(mainDictService.findPage(pageRequest));
    }
}
