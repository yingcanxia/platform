package com.experimental.dict.sercice;

import com.experimental.coreservice.CurdService;
import com.experimental.maindata.model.MainDict;

import java.util.List;

public interface IMainDictService extends CurdService<MainDict> {
    /**
     * 根据名称查询
     * @param lable
     * @return
     */
    List<MainDict> findByLable(String lable);

}
