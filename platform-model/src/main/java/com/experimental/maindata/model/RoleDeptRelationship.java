/**
 *
 */

package com.experimental.maindata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role_dept_relationship
 * @Edit_Description:
 * @Create_Version:login-demo 1.0
 *
 * @mbg.generated do_not_delete_during_merge 2020-09-26 19:30:02
 */
public class RoleDeptRelationship implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   角色id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.role_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long roleId;

    /**
     * Database Column Remarks:
     *   部门id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.dept_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long deptId;

    /**
     * Database Column Remarks:
     *   创建人id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.create_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long createId;

    /**
     * Database Column Remarks:
     *   创建时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.create_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新人id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.update_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long updateId;

    /**
     * Database Column Remarks:
     *   更新时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.update_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   是否删除：0正常，1删除
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_dept_relationship.is_delete
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_dept_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.id
     *
     * @return the value of role_dept_relationship.id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.id
     *
     * @param id the value for role_dept_relationship.id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.role_id
     *
     * @return the value of role_dept_relationship.role_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.role_id
     *
     * @param roleId the value for role_dept_relationship.role_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.dept_id
     *
     * @return the value of role_dept_relationship.dept_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.dept_id
     *
     * @param deptId the value for role_dept_relationship.dept_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.create_id
     *
     * @return the value of role_dept_relationship.create_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.create_id
     *
     * @param createId the value for role_dept_relationship.create_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.create_time
     *
     * @return the value of role_dept_relationship.create_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.create_time
     *
     * @param createTime the value for role_dept_relationship.create_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.update_id
     *
     * @return the value of role_dept_relationship.update_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.update_id
     *
     * @param updateId the value for role_dept_relationship.update_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.update_time
     *
     * @return the value of role_dept_relationship.update_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.update_time
     *
     * @param updateTime the value for role_dept_relationship.update_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_dept_relationship.is_delete
     *
     * @return the value of role_dept_relationship.is_delete
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_dept_relationship.is_delete
     *
     * @param isDelete the value for role_dept_relationship.is_delete
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}