package com.kysoft.cpsi.task.mapper;

import java.util.List;
import java.util.Map;

import com.kysoft.cpsi.task.entity.HcrwRc;


public interface HcrwRcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_NBCC_RC_QY
     *
     * @mbggenerated Sun Jul 24 11:36:19 CST 2016
     */
    int insert(HcrwRc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_NBCC_RC_QY
     *
     * @mbggenerated Sun Jul 24 11:36:19 CST 2016
     */
    int insertSelective(HcrwRc record);
    
    
    List<HcrwRc> selectExclude(Map<String, Object> param);
}