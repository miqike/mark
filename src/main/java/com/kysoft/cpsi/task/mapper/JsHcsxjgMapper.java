package com.kysoft.cpsi.task.mapper;

import com.kysoft.cpsi.task.entity.JsHcsxjg;
import com.kysoft.cpsi.task.entity.JsHcsxjgKey;

import java.util.List;
import java.util.Map;

public interface JsHcsxjgMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_JS_HCSXJG
	 * @mbggenerated  Tue Aug 09 10:06:05 CST 2016
	 */
	int deleteByPrimaryKey(JsHcsxjgKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_JS_HCSXJG
	 * @mbggenerated  Tue Aug 09 10:06:05 CST 2016
	 */
	int insert(JsHcsxjg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_JS_HCSXJG
	 * @mbggenerated  Tue Aug 09 10:06:05 CST 2016
	 */
	int insertSelective(JsHcsxjg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_JS_HCSXJG
	 * @mbggenerated  Tue Aug 09 10:06:05 CST 2016
	 */
	JsHcsxjg selectByPrimaryKey(JsHcsxjgKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_JS_HCSXJG
	 * @mbggenerated  Tue Aug 09 10:06:05 CST 2016
	 */
	int updateByPrimaryKeySelective(JsHcsxjg record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_JS_HCSXJG
	 * @mbggenerated  Tue Aug 09 10:06:05 CST 2016
	 */
	int updateByPrimaryKey(JsHcsxjg record);

	Integer selectCountByTaskId(String hcrwId);

	List<JsHcsxjg> queryForTask(Map<String, Object> param);

}