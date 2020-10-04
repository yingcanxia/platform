/**
 *
 */

package com.experimental.maindata.mapper;

import com.experimental.maindata.model.StaffRoleRelationship;
import com.experimental.maindata.model.StaffRoleRelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table staff_role_relationship
 * @Edit_Description:
 * @Create_Version:login-demo 1.0
 *
 * @mbg.generated do_not_delete_during_merge 2020-09-26 19:30:02
 */
public interface StaffRoleRelationshipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    long countByExample(StaffRoleRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int deleteByExample(StaffRoleRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int insert(StaffRoleRelationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int insertSelective(StaffRoleRelationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    List<StaffRoleRelationship> selectByExample(StaffRoleRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    StaffRoleRelationship selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int updateByExampleSelective(@Param("record") StaffRoleRelationship record, @Param("example") StaffRoleRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int updateByExample(@Param("record") StaffRoleRelationship record, @Param("example") StaffRoleRelationshipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int updateByPrimaryKeySelective(StaffRoleRelationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_role_relationship
     * @Edit_Description:
     * @Create_Version:login-demo 1.0
     *
     * @mbg.generated 2020-09-26 19:30:02
     */
    int updateByPrimaryKey(StaffRoleRelationship record);
}