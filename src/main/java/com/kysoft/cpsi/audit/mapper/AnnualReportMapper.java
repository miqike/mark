package com.kysoft.cpsi.audit.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.kysoft.cpsi.audit.entity.AnnualReport;

public interface AnnualReportMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB
	 * @mbggenerated  Wed Jun 22 19:08:09 CST 2016
	 */
	int deleteByPrimaryKey(String hcrwId);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB
	 * @mbggenerated  Wed Jun 22 19:08:09 CST 2016
	 */
	int insert(AnnualReport record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB
	 * @mbggenerated  Wed Jun 22 19:08:09 CST 2016
	 */
	int insertSelective(AnnualReport record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB
	 * @mbggenerated  Wed Jun 22 19:08:09 CST 2016
	 */
	AnnualReport selectByPrimaryKey(String hcrwId);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB
	 * @mbggenerated  Wed Jun 22 19:08:09 CST 2016
	 */
	int updateByPrimaryKeySelective(AnnualReport record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB
	 * @mbggenerated  Wed Jun 22 19:08:09 CST 2016
	 */
	int updateByPrimaryKey(AnnualReport record);


	AnnualReport selectByPrimaryKey2(String hcrwId);


	@Select("select HCRW_ID from T_NB_BD where ND = #{nd} and XYDM = #{xydm}")
	@ResultType(value = java.lang.String.class)
	String selectCountByNdAndXydm(@Param("nd")Integer nd, @Param("xydm")String xydm);

	void updateByNdAndXydm(AnnualReport ar);
	
}