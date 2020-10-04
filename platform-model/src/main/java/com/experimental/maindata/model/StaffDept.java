/**
 *
 */

package com.experimental.maindata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table staff_dept
 * @Edit_Description:
 * @Create_Version:login-demo 1.0
 *
 * @mbg.generated do_not_delete_during_merge 2020-09-26 19:30:02
 */
public class StaffDept implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_dept.id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   部门名称
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_dept.name
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private String name;

    /**
     * Database Column Remarks:
     *   备注
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_dept.remark
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   创建人id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_dept.create_id
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
     * This field corresponds to the database column staff_dept.create_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   创建人id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_dept.update_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long updateId;

    /**
     * Database Column Remarks:
     *   创建时间
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_dept.update_time
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   是否删除：0未产出，1删除
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column staff_dept.is_delete
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table staff_dept
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff_dept.id
     *
     * @return the value of staff_dept.id
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
     * This method sets the value of the database column staff_dept.id
     *
     * @param id the value for staff_dept.id
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
     * This method returns the value of the database column staff_dept.name
     *
     * @return the value of staff_dept.name
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff_dept.name
     *
     * @param name the value for staff_dept.name
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff_dept.remark
     *
     * @return the value of staff_dept.remark
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column staff_dept.remark
     *
     * @param remark the value for staff_dept.remark
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column staff_dept.create_id
     *
     * @return the value of staff_dept.create_id
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
     * This method sets the value of the database column staff_dept.create_id
     *
     * @param createId the value for staff_dept.create_id
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
     * This method returns the value of the database column staff_dept.create_time
     *
     * @return the value of staff_dept.create_time
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
     * This method sets the value of the database column staff_dept.create_time
     *
     * @param createTime the value for staff_dept.create_time
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
     * This method returns the value of the database column staff_dept.update_id
     *
     * @return the value of staff_dept.update_id
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
     * This method sets the value of the database column staff_dept.update_id
     *
     * @param updateId the value for staff_dept.update_id
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
     * This method returns the value of the database column staff_dept.update_time
     *
     * @return the value of staff_dept.update_time
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
     * This method sets the value of the database column staff_dept.update_time
     *
     * @param updateTime the value for staff_dept.update_time
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
     * This method returns the value of the database column staff_dept.is_delete
     *
     * @return the value of staff_dept.is_delete
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
     * This method sets the value of the database column staff_dept.is_delete
     *
     * @param isDelete the value for staff_dept.is_delete
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}