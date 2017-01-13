package com.kysoft.cpsi.audit.mapper;

import com.kysoft.cpsi.audit.entity.Investment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvestmentMapper {

    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int insert(Investment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int insertSelective(Investment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	Investment selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int updateByPrimaryKeySelective(Investment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_DWTZ
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int updateByPrimaryKey(Investment record);

	List<Investment> selectByTaskId(String hcrwId);

    List<Investment> selectByTaskId2(String hcrwId);
    List<Investment> selectByTaskId3(String hcrwId);

	@Delete("delete from T_NB_BD_DWTZ where  (xydm,nd) in(select a.hcdw_xydm,b.nd from t_hcrw a,t_hcrw_nd b where a.id=b.hcrw_id and a.id=#{hcrwId}) and sjly=2")
	void deleteByTaskId2(String taskId);
	@Delete("delete from T_NB_BD_DWTZ where xydm=(select a.hcdw_xydm from t_hcrw a where a.id=#{hcrwId}) and nd=#{nd} and sjly=2")
	void deleteByTaskIdNd(@Param("hcrwId")String hcrwId, @Param("nd")Integer nd);


	void insert2(Investment investment);

}