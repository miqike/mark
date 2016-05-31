package com.kysoft.cpsi.audit.mapper;

import com.kysoft.cpsi.audit.entity.Homepage;

import java.util.List;

public interface HomepageMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_WD
     *
     * @mbggenerated Tue May 31 10:35:29 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_WD
     *
     * @mbggenerated Tue May 31 10:35:29 CST 2016
     */
    int insert(Homepage record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_WD
     *
     * @mbggenerated Tue May 31 10:35:29 CST 2016
     */
    int insertSelective(Homepage record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_WD
     *
     * @mbggenerated Tue May 31 10:35:29 CST 2016
     */
    Homepage selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_WD
     *
     * @mbggenerated Tue May 31 10:35:29 CST 2016
     */
    int updateByPrimaryKeySelective(Homepage record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_WD
     *
     * @mbggenerated Tue May 31 10:35:29 CST 2016
     */
    int updateByPrimaryKey(Homepage record);

    List<Homepage> selectByTaskId(String hcrwId);

    List<Homepage> selectByTaskId2(String hcrwId);

}