package com.experimental.dict.sercice.impl;

import com.experimental.dict.sercice.IMainDictService;
import com.experimental.maindata.mapper.MainDictMapper;
import com.experimental.maindata.model.MainDict;
import com.experimental.page.MybatisPageHelper;
import com.experimental.page.PageRequest;
import com.experimental.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mainDictService")
public class MainDictServiceImpl implements IMainDictService {

    @Autowired
    private MainDictMapper mainDictMapper;


    @Override
    public List<MainDict> findByLable(String lable) {

        return null;
    }

    @Override
    public int save(MainDict record) {
        if(record.getId() == null || record.getId() == 0) {
            return mainDictMapper.insertSelective(record);
        }else {
            return mainDictMapper.updateByPrimaryKey(record);
        }
    }

    @Override
    public int delete(MainDict record) {
        mainDictMapper.deleteByPrimaryKey(record.getId());
        return 1;
    }

    @Override
    public MainDict selectById(Long id) {
        return mainDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label = pageRequest.getParams().get("label");
        if(label != null) {
            return MybatisPageHelper.findPage(pageRequest, mainDictMapper, "findPageByLabel", label);
        }
        return MybatisPageHelper.findPage(pageRequest, mainDictMapper);
    }
}
