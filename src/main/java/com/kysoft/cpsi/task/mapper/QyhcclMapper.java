package com.kysoft.cpsi.task.mapper;

import com.kysoft.cpsi.task.entity.Qyhccl;

public interface QyhcclMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_QYHCCL
	 * @mbggenerated  Mon May 23 07:56:37 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_QYHCCL
	 * @mbggenerated  Mon May 23 07:56:37 CST 2016
	 */
	int insert(Qyhccl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_QYHCCL
	 * @mbggenerated  Mon May 23 07:56:37 CST 2016
	 */
	int insertSelective(Qyhccl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_QYHCCL
	 * @mbggenerated  Mon May 23 07:56:37 CST 2016
	 */
	Qyhccl selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_QYHCCL
	 * @mbggenerated  Mon May 23 07:56:37 CST 2016
	 */
	int updateByPrimaryKeySelective(Qyhccl record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_QYHCCL
	 * @mbggenerated  Mon May 23 07:56:37 CST 2016
	 */
	int updateByPrimaryKey(Qyhccl record);
}