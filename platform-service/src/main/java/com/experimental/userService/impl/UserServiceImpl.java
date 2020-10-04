package com.experimental.userService.impl;

import com.experimental.maindata.mapper.StaffMapper;
import com.experimental.maindata.model.Staff;
import com.experimental.maindata.model.StaffExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.experimental.userService.IUserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> selectAll() {
        StaffExample example = new StaffExample();
        return staffMapper.selectByExample(example);
    }
}
