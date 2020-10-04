package com.experimental.coreservice;

import com.experimental.page.PageRequest;
import com.experimental.page.PageResult;

public interface CurdService<T> {
    /**
     *
     * @param record
     * @return
     */
    int save(T record);

    /**
     *
     * @param record
     * @return
     */
    int delete(T record);

    /**
     *
     * @param id
     * @return
     */
    T selectById(Long id);

    /**
     *
     * @param pageRequest
     * @return
     */
    PageResult findPage(PageRequest pageRequest);
}
