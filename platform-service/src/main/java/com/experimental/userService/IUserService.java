package com.experimental.userService;



import com.experimental.maindata.model.Staff;

import java.util.List;

public interface IUserService {
    List<Staff> selectAll();
}
