package com.kysoft.cpsi.audit.mapper;

import com.kysoft.cpsi.audit.entity.Investment;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

public interface InvestmentMapper {

    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbggenerated  Sat Jun 25 09:54:30 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbggenerated  Sat Jun 25 09:54:30 CST 2016
	 */
	int insert(Investment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbggenerated  Sat Jun 25 09:54:30 CST 2016
	 */
	int insertSelective(Investment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbggenerated  Sat Jun 25 09:54:30 CST 2016
	 */
	Investment selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbggenerated  Sat Jun 25 09:54:30 CST 2016
	 */
	int updateByPrimaryKeySelective(Investment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbggenerated  Sat Jun 25 09:54:30 CST 2016
	 */
	int updateByPrimaryKey(Investment record);

	List<Investment> selectByTaskId(String hcrwId);

    List<Investment> selectByTaskId2(String hcrwId);

	@Delete("delete from T_NB_BD_DWTZ where HCRW_ID = #{taskId,jdbcType=VARCHAR}")
	void deleteByTaskId(String taskId);

}