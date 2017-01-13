package com.kysoft.cpsi.audit.mapper;

import com.kysoft.cpsi.audit.entity.StockRightChange;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockRightChangeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_GQBG
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_GQBG
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int insert(StockRightChange record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_GQBG
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int insertSelective(StockRightChange record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_GQBG
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	StockRightChange selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_GQBG
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int updateByPrimaryKeySelective(StockRightChange record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_NB_GQBG
	 * @mbg.generated  Mon Jan 09 11:26:18 CST 2017
	 */
	int updateByPrimaryKey(StockRightChange record);

	@Delete("delete from T_NB_BD_GQBG where  (xydm,nd) in(select a.hcdw_xydm,b.nd from t_hcrw a,t_hcrw_nd b where a.id=b.hcrw_id and a.id=#{hcrwId}) and sjly=2")
	void deleteByTaskId2(String hcrwId);
	@Delete("delete from T_NB_BD_GQBG where  xydm=(select a.hcdw_xydm from t_hcrw a where a.id=#{hcrwId}) and nd=#{nd} and sjly=2")
	void deleteByTaskIdNd(@Param("hcrwId")String hcrwId, @Param("nd")Integer nd);


	List<StockRightChange> selectByTaskId(String hcrwId);
	
	List<StockRightChange> selectByTaskId2(String hcrwId);
	List<StockRightChange> selectByTaskId3(String hcrwId);

	void insert2(StockRightChange stockRightChange);
}