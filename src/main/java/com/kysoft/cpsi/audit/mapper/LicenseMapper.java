package com.kysoft.cpsi.audit.mapper;

import com.kysoft.cpsi.audit.entity.License;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

public interface LicenseMapper {

    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_XZXK
	 * @mbggenerated  Sat Jun 25 10:35:58 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_XZXK
	 * @mbggenerated  Sat Jun 25 10:35:58 CST 2016
	 */
	int insert(License record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_XZXK
	 * @mbggenerated  Sat Jun 25 10:35:58 CST 2016
	 */
	int insertSelective(License record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_XZXK
	 * @mbggenerated  Sat Jun 25 10:35:58 CST 2016
	 */
	License selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_XZXK
	 * @mbggenerated  Sat Jun 25 10:35:58 CST 2016
	 */
	int updateByPrimaryKeySelective(License record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_XZXK
	 * @mbggenerated  Sat Jun 25 10:35:58 CST 2016
	 */
	int updateByPrimaryKey(License record);

	List<License> selectByTaskId(String hcrwId);

    List<License> selectByTaskId2(String hcrwId);

    @Delete("delete from T_NB_BD_XZXK where HCRW_ID = #{taskId,jdbcType=VARCHAR}")
	void deleteByTaskId(String hcrwId);

}