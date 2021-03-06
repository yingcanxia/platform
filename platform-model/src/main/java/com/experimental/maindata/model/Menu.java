/**
 *
 */

package com.experimental.maindata.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table menu
 * @Edit_Description:
 * @Create_Version:login-demo 1.0
 *
 * @mbg.generated do_not_delete_during_merge 2020-09-26 19:30:02
 */
public class Menu implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   菜单名称
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.name
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private String name;

    /**
     * Database Column Remarks:
     *   父菜单
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parent_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Long parentId;

    /**
     * Database Column Remarks:
     *   菜单url
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private String url;

    /**
     * Database Column Remarks:
     *   授权
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.perms
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private String perms;

    /**
     * Database Column Remarks:
     *   类型：0目录，1菜单，2按钮
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.type
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Integer type;

    /**
     * Database Column Remarks:
     *   菜单图标
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.icon
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private String icon;

    /**
     * Database Column Remarks:
     *   排序
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.order_num
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Integer orderNum;

    /**
     * Database Column Remarks:
     *   创建人id
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.create_id
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
     * This field corresponds to the database column menu.create_time
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
     * This field corresponds to the database column menu.update_id
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
     * This field corresponds to the database column menu.update_time
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
     * This field corresponds to the database column menu.is_delete
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table menu
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
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
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
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
     * This method returns the value of the database column menu.name
     *
     * @return the value of menu.name
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
     * This method sets the value of the database column menu.name
     *
     * @param name the value for menu.name
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
     * This method returns the value of the database column menu.parent_id
     *
     * @return the value of menu.parent_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parent_id
     *
     * @param parentId the value for menu.parent_id
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url
     *
     * @return the value of menu.url
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url
     *
     * @param url the value for menu.url
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.perms
     *
     * @return the value of menu.perms
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public String getPerms() {
        return perms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.perms
     *
     * @param perms the value for menu.perms
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.type
     *
     * @return the value of menu.type
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.type
     *
     * @param type the value for menu.type
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.icon
     *
     * @return the value of menu.icon
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.icon
     *
     * @param icon the value for menu.icon
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.order_num
     *
     * @return the value of menu.order_num
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.order_num
     *
     * @param orderNum the value for menu.order_num
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.create_id
     *
     * @return the value of menu.create_id
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
     * This method sets the value of the database column menu.create_id
     *
     * @param createId the value for menu.create_id
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
     * This method returns the value of the database column menu.create_time
     *
     * @return the value of menu.create_time
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
     * This method sets the value of the database column menu.create_time
     *
     * @param createTime the value for menu.create_time
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
     * This method returns the value of the database column menu.update_id
     *
     * @return the value of menu.update_id
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
     * This method sets the value of the database column menu.update_id
     *
     * @param updateId the value for menu.update_id
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
     * This method returns the value of the database column menu.update_time
     *
     * @return the value of menu.update_time
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
     * This method sets the value of the database column menu.update_time
     *
     * @param updateTime the value for menu.update_time
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
     * This method returns the value of the database column menu.is_delete
     *
     * @return the value of menu.is_delete
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
     * This method sets the value of the database column menu.is_delete
     *
     * @param isDelete the value for menu.is_delete
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}