package com.kysoft.cpsi.task.mapper;

import com.kysoft.cpsi.task.entity.Hcrw;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface HcrwMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCRW
	 * @mbggenerated  Wed Aug 10 11:29:36 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCRW
	 * @mbggenerated  Wed Aug 10 11:29:36 CST 2016
	 */
	int insert(Hcrw record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCRW
	 * @mbggenerated  Wed Aug 10 11:29:36 CST 2016
	 */
	int insertSelective(Hcrw record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCRW
	 * @mbggenerated  Wed Aug 10 11:29:36 CST 2016
	 */
	Hcrw selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCRW
	 * @mbggenerated  Wed Aug 10 11:29:36 CST 2016
	 */
	int updateByPrimaryKeySelective(Hcrw record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCRW
	 * @mbggenerated  Wed Aug 10 11:29:36 CST 2016
	 */
	int updateByPrimaryKey(Hcrw record);

	//根据�???????查单位查询任务列�???????--3101
	 //查询已认领
    List<Hcrw> queryForOrg1(Map<String, Object> param);
    //查询未认领
    List<Hcrw> queryForOrg2(Map<String, Object> param);
  
    
    List<Hcrw> queryForOrg(Map<String, Object> param);
    //根据信用代码查询任务列表--2101
    List<Hcrw> queryForXydm(Map<String, Object> param);

    //根据�???????查人员查询任务列�???????--5101
    List<Hcrw> queryForAuditor1(Map<String, Object> param);
    
    List<Hcrw> queryForAuditor2(Map<String, Object> param);
    
    List<Map<String, Object>> queryForAuditorM(Map<String, Object> param);

    List<Hcrw> queryForPlan(Map<String, Object> param);

    Integer selectCountByPlanId(String planId);

    void pullData(Map<String, Object> param);
    
    void compareData(Map<String, Object> param);

    void updateLoadedByPrimaryKey(String hcrwId);

    List<Hcrw> query(Map<String, Object> param);

    List<Map<String, Object>> queryTongJiFenXi(Map<String, Object> params);

	void updateAccept(@Param("taskIds") List<String> taskIds, @Param("userId")String userId, @Param("userName")String userName);
	
	void updateUnAccept(@Param("taskIds") List<String> taskIds);

	Integer selectYrlsByPlanId(String planId);

	void updateStatusByPrimaryKey(@Param("taskId") String hcrwId,  @Param("statusCode")Integer statusCode);

	@Select("select ID from T_HCRW where ND = #{nd} and HCDW_XYDM = #{xydm}")
	@ResultType(value = java.lang.String.class)
	String selectTaskIdByNdAndXydm(@Param("nd")Integer nd, @Param("xydm")String xydm);

	void updateDispatchByPlanId(@Param("hcjhId") String hcjhId, @Param("xdzt")Integer xdzt);

	void updateDocReadyReportFlag(@Param("hcrwId")String hcrwId, @Param("docReadyReportFlag")int docReadyReportFlag, @Param("userName")String userName);

	@Update("UPDATE T_HCRW SET UPLOAD_FILES = (SELECT COUNT(ID) FROM t_hcclmx WHERE hcrw_id=#{hcrwId} AND sfbyx=1) WHERE ID=#{hcrwId}")
	void updateHcclStatByPrimaryKey(String hcrwId);

	void updateRequiredDocByPlanId(String hcjhId);
	
	void updateRequiredDocByPlanId2(String hcjhId);
	
	@Update("UPDATE T_HCRW SET DOC_READY_FLAG = #{docReadyFlag} WHERE ID=#{hcrwId}")
	void updateDocReadyFlag(@Param("hcrwId")String hcrwId, @Param("docReadyFlag")int docReadyFlag);

	@Update("UPDATE T_HCRW SET REQUIRED_FILES_FUR = (SELECT COUNT(ID) FROM t_hccl_fur WHERE hcrw_id=#{hcrwId} AND sfbyx=1), UPLOAD_FILES_FUR = (SELECT COUNT(ID) FROM t_hccl_fur WHERE hcrw_id=#{hcrwId} AND sfbyx=1 AND MONGO_ID IS NOT NULL) WHERE ID=#{hcrwId}")
	void updateHcclStatByPrimaryKey2(String hcrwId);

	@Update("UPDATE T_HCRW SET DOC_READY_FLAG_FUR = #{docReadyFlagFur} WHERE ID=#{hcrwId}")
	void updateDocReadyFlag2(@Param("hcrwId")String hcrwId, @Param("docReadyFlagFur")int docReadyFlagFur);

	@Update("UPDATE T_HCRW SET AUDIT_RESULT = #{auditResult}, AUDIT_COMMENT = #{auditComment}, AUDITOR = #{auditor}, HCJIEGUO=#{hcjieguo}, AUDITOR_NAME = #{auditorName}, SJWCRQ = #{sjwcrq}, AUDIT_TIME = SYSDATE WHERE ID=#{id}")
	void updateAuditByPrimaryKey(Hcrw hcrw);

}