package com.kysoft.cpsi.audit.mapper;

import com.kysoft.cpsi.audit.entity.Guarantee;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

public interface GuaranteeMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWDB
	 * @mbggenerated  Sat Jun 25 10:22:19 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWDB
	 * @mbggenerated  Sat Jun 25 10:22:19 CST 2016
	 */
	int insert(Guarantee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWDB
	 * @mbggenerated  Sat Jun 25 10:22:19 CST 2016
	 */
	int insertSelective(Guarantee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWDB
	 * @mbggenerated  Sat Jun 25 10:22:19 CST 2016
	 */
	Guarantee selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWDB
	 * @mbggenerated  Sat Jun 25 10:22:19 CST 2016
	 */
	int updateByPrimaryKeySelective(Guarantee record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWDB
	 * @mbggenerated  Sat Jun 25 10:22:19 CST 2016
	 */
	int updateByPrimaryKey(Guarantee record);

	List<Guarantee> selectByTaskId(String hcrwId);

    List<Guarantee> selectByTaskId2(String hcrwId);

    @Delete("delete from T_NB_BD_DWDB where HCRW_ID = #{taskId,jdbcType=VARCHAR}")
	void deleteByTaskId(String hcrwId);

}