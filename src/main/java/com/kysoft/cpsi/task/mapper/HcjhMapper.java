package com.kysoft.cpsi.task.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.kysoft.cpsi.task.entity.Hcjh;

public interface HcjhMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCJH
	 * @mbggenerated  Mon Jun 13 13:09:37 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCJH
	 * @mbggenerated  Mon Jun 13 13:09:37 CST 2016
	 */
	int insert(Hcjh record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCJH
	 * @mbggenerated  Mon Jun 13 13:09:37 CST 2016
	 */
	int insertSelective(Hcjh record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCJH
	 * @mbggenerated  Mon Jun 13 13:09:37 CST 2016
	 */
	Hcjh selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCJH
	 * @mbggenerated  Mon Jun 13 13:09:37 CST 2016
	 */
	int updateByPrimaryKeySelective(Hcjh record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCJH
	 * @mbggenerated  Mon Jun 13 13:09:37 CST 2016
	 */
	int updateByPrimaryKey(Hcjh record);

	List<Hcjh> query(Map<String, Object> param);

	void updateAuditById(@Param("hcjhId") String hcjhId, @Param("shzt")Integer shzt, @Param("userId")String userId, @Param("userName")String userName);

	Map<String, Object> testDblink(Map<String, Object> paramMap);

	Map<String, Object> importDblink(Map<String, Object> paramMap);

	void updateAcceptStatusByPrimaryKey(@Param("hcjhId") String hcjhId, @Param("yrlsl")int yrlsl);
	
	List<Hcjh> queryPlanAbstract(Map<String, Object> param);

	int selectCountByGsjhbh(String gsjhbh);
}