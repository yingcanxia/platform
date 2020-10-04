package com.experimental.staff.service.impl;

import com.experimental.maindata.mapper.*;
import com.experimental.maindata.model.*;
import com.experimental.page.MybatisPageHelper;
import com.experimental.page.PageRequest;
import com.experimental.page.PageResult;
import com.experimental.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private StaffRoleMapper staffRoleMapper;

    @Autowired
    private StaffRoleRelationshipMapper staffRoleRelationshipMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private MenuRoleRelationshipMapper menuRoleRelationshipMapper;


    @Override
    public List<Staff> findAll() {
        return null;
    }

    @Override
    public Staff findByName(String username) {
        StaffExample example = new StaffExample();
        example.createCriteria().andUsernameEqualTo(username);
        Staff staff = staffMapper.selectByExample(example).get(0);
        return staff;
    }

    @Override
    public List<String> findPermissions(Staff staff) {
        StaffRoleRelationshipExample srExample = new StaffRoleRelationshipExample();
        srExample.createCriteria().andStaffIdEqualTo(staff.getId());
        List<StaffRoleRelationship>srrList = staffRoleRelationshipMapper.selectByExample(srExample);
        MenuRoleRelationshipExample mrrExample = new MenuRoleRelationshipExample();
        mrrExample.createCriteria().andRoleIdIn(srrList.stream().map(item->item.getRoleId()).collect(Collectors.toList()));
        List<MenuRoleRelationship> mrrList = menuRoleRelationshipMapper.selectByExample(mrrExample);
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andIdIn(mrrList.stream().map(item->item.getMenuId()).collect(Collectors.toList()));
        List<Menu>menuList = menuMapper.selectByExample(menuExample);
        List<String> permissions = menuList.stream().map(item->item.getPerms()).collect(Collectors.toList());
        return permissions;
    }

    @Override
    public List<StaffRole> findStaffRole(Long userId) {
        StaffRoleRelationshipExample example = new StaffRoleRelationshipExample();
        example.createCriteria().andStaffIdEqualTo(userId);
        List<StaffRoleRelationship>relationships = staffRoleRelationshipMapper.selectByExample(example);
        StaffRoleExample srExample = new StaffRoleExample();
        srExample.createCriteria().andCreateIdIn(relationships.stream().map(item->item.getRoleId()).collect(Collectors.toList()));
        List<StaffRole> roles = staffRoleMapper.selectByExample(srExample);
        return roles;
    }

    @Override
    public int save(Staff record) {
        Long id = null;
        if(record.getId() == null || record.getId() == 0) {
            // 新增用户
            staffMapper.insertSelective(record);
            id = record.getId();
        } else {
            // 更新用户信息
            staffMapper.updateByPrimaryKeySelective(record);
        }
        // 更新用户角色
        return 1;
    }

    @Override
    public int delete(Staff record) {
        return staffMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public Staff selectById(Long id) {
        return staffMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest,staffMapper);
    }
}
