package com.experimental.staff.service;

import com.experimental.coreservice.CurdService;
import com.experimental.maindata.model.Staff;
import com.experimental.maindata.model.StaffRole;

import java.util.List;

public interface StaffService extends CurdService<Staff> {
    List<Staff> findAll();

    Staff findByName(String username);

    List<String>findPermissions(Staff staff);

    List<StaffRole> findStaffRole(Long userId);


}
