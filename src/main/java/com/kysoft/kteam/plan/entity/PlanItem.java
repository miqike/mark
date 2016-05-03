package com.kysoft.kteam.plan.entity;

import java.util.Date;

public class PlanItem {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.SN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String sn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.TITLE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.IS_DEPT_PLAN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Byte isDeptPlan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.OWNER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String ownerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.OWNER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String ownerName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.SUPERINTENDENT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String superintendentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.SUPERINTENDENT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String superintendentName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.COUPLER
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String coupler;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.DEPT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String deptId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.DEPT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String deptName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.COUPLE_DEP
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String coupleDep;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.CREATE_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.AUTHOR_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String authorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.AUTHOR_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String authorName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.APPROVE_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Date approveTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.APPROVER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String approverId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.APPROVER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String approverName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.CYCLE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String cycle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.IMPORTANCE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Integer importance;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.INSTANCY
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Integer instancy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.STATUS
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.START
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Date start;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.END
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Date end;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.START_ACT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Date startAct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.END_ACT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Date endAct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.NEED_VERIFY
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Integer needVerify;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.VERIFIER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String verifierId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.VERIFIER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String verifierName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.VERIFY_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Date verifyTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.IS_ANNUAL_PLAN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Byte isAnnualPlan;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.DESCRIPTION
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.WEIGHT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Integer weight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.WEIGHT_PER
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Integer weightPer;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.PROGRESS
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private Byte progress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.PARENT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String parentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_PLAN.PARENT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	private String parentName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.ID
	 * @return  the value of T_PLAN.ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.ID
	 * @param id  the value for T_PLAN.ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.SN
	 * @return  the value of T_PLAN.SN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.SN
	 * @param sn  the value for T_PLAN.SN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.TITLE
	 * @return  the value of T_PLAN.TITLE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.TITLE
	 * @param title  the value for T_PLAN.TITLE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.IS_DEPT_PLAN
	 * @return  the value of T_PLAN.IS_DEPT_PLAN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Byte getIsDeptPlan() {
		return isDeptPlan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.IS_DEPT_PLAN
	 * @param isDeptPlan  the value for T_PLAN.IS_DEPT_PLAN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setIsDeptPlan(Byte isDeptPlan) {
		this.isDeptPlan = isDeptPlan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.OWNER_ID
	 * @return  the value of T_PLAN.OWNER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.OWNER_ID
	 * @param ownerId  the value for T_PLAN.OWNER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.OWNER_NAME
	 * @return  the value of T_PLAN.OWNER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.OWNER_NAME
	 * @param ownerName  the value for T_PLAN.OWNER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.SUPERINTENDENT_ID
	 * @return  the value of T_PLAN.SUPERINTENDENT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getSuperintendentId() {
		return superintendentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.SUPERINTENDENT_ID
	 * @param superintendentId  the value for T_PLAN.SUPERINTENDENT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setSuperintendentId(String superintendentId) {
		this.superintendentId = superintendentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.SUPERINTENDENT_NAME
	 * @return  the value of T_PLAN.SUPERINTENDENT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getSuperintendentName() {
		return superintendentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.SUPERINTENDENT_NAME
	 * @param superintendentName  the value for T_PLAN.SUPERINTENDENT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setSuperintendentName(String superintendentName) {
		this.superintendentName = superintendentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.COUPLER
	 * @return  the value of T_PLAN.COUPLER
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getCoupler() {
		return coupler;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.COUPLER
	 * @param coupler  the value for T_PLAN.COUPLER
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setCoupler(String coupler) {
		this.coupler = coupler;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.DEPT_ID
	 * @return  the value of T_PLAN.DEPT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getDeptId() {
		return deptId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.DEPT_ID
	 * @param deptId  the value for T_PLAN.DEPT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.DEPT_NAME
	 * @return  the value of T_PLAN.DEPT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.DEPT_NAME
	 * @param deptName  the value for T_PLAN.DEPT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.COUPLE_DEP
	 * @return  the value of T_PLAN.COUPLE_DEP
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getCoupleDep() {
		return coupleDep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.COUPLE_DEP
	 * @param coupleDep  the value for T_PLAN.COUPLE_DEP
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setCoupleDep(String coupleDep) {
		this.coupleDep = coupleDep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.CREATE_TIME
	 * @return  the value of T_PLAN.CREATE_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.CREATE_TIME
	 * @param createTime  the value for T_PLAN.CREATE_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.AUTHOR_ID
	 * @return  the value of T_PLAN.AUTHOR_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getAuthorId() {
		return authorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.AUTHOR_ID
	 * @param authorId  the value for T_PLAN.AUTHOR_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.AUTHOR_NAME
	 * @return  the value of T_PLAN.AUTHOR_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.AUTHOR_NAME
	 * @param authorName  the value for T_PLAN.AUTHOR_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.APPROVE_TIME
	 * @return  the value of T_PLAN.APPROVE_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Date getApproveTime() {
		return approveTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.APPROVE_TIME
	 * @param approveTime  the value for T_PLAN.APPROVE_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.APPROVER_ID
	 * @return  the value of T_PLAN.APPROVER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getApproverId() {
		return approverId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.APPROVER_ID
	 * @param approverId  the value for T_PLAN.APPROVER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.APPROVER_NAME
	 * @return  the value of T_PLAN.APPROVER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getApproverName() {
		return approverName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.APPROVER_NAME
	 * @param approverName  the value for T_PLAN.APPROVER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.CYCLE
	 * @return  the value of T_PLAN.CYCLE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getCycle() {
		return cycle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.CYCLE
	 * @param cycle  the value for T_PLAN.CYCLE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.IMPORTANCE
	 * @return  the value of T_PLAN.IMPORTANCE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Integer getImportance() {
		return importance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.IMPORTANCE
	 * @param importance  the value for T_PLAN.IMPORTANCE
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setImportance(Integer importance) {
		this.importance = importance;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.INSTANCY
	 * @return  the value of T_PLAN.INSTANCY
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Integer getInstancy() {
		return instancy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.INSTANCY
	 * @param instancy  the value for T_PLAN.INSTANCY
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setInstancy(Integer instancy) {
		this.instancy = instancy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.STATUS
	 * @return  the value of T_PLAN.STATUS
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.STATUS
	 * @param status  the value for T_PLAN.STATUS
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.START
	 * @return  the value of T_PLAN.START
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.START
	 * @param start  the value for T_PLAN.START
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.END
	 * @return  the value of T_PLAN.END
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.END
	 * @param end  the value for T_PLAN.END
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.START_ACT
	 * @return  the value of T_PLAN.START_ACT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Date getStartAct() {
		return startAct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.START_ACT
	 * @param startAct  the value for T_PLAN.START_ACT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setStartAct(Date startAct) {
		this.startAct = startAct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.END_ACT
	 * @return  the value of T_PLAN.END_ACT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Date getEndAct() {
		return endAct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.END_ACT
	 * @param endAct  the value for T_PLAN.END_ACT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setEndAct(Date endAct) {
		this.endAct = endAct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.NEED_VERIFY
	 * @return  the value of T_PLAN.NEED_VERIFY
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Integer getNeedVerify() {
		return needVerify;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.NEED_VERIFY
	 * @param needVerify  the value for T_PLAN.NEED_VERIFY
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setNeedVerify(Integer needVerify) {
		this.needVerify = needVerify;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.VERIFIER_ID
	 * @return  the value of T_PLAN.VERIFIER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getVerifierId() {
		return verifierId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.VERIFIER_ID
	 * @param verifierId  the value for T_PLAN.VERIFIER_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setVerifierId(String verifierId) {
		this.verifierId = verifierId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.VERIFIER_NAME
	 * @return  the value of T_PLAN.VERIFIER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getVerifierName() {
		return verifierName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.VERIFIER_NAME
	 * @param verifierName  the value for T_PLAN.VERIFIER_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setVerifierName(String verifierName) {
		this.verifierName = verifierName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.VERIFY_TIME
	 * @return  the value of T_PLAN.VERIFY_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Date getVerifyTime() {
		return verifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.VERIFY_TIME
	 * @param verifyTime  the value for T_PLAN.VERIFY_TIME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setVerifyTime(Date verifyTime) {
		this.verifyTime = verifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.IS_ANNUAL_PLAN
	 * @return  the value of T_PLAN.IS_ANNUAL_PLAN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Byte getIsAnnualPlan() {
		return isAnnualPlan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.IS_ANNUAL_PLAN
	 * @param isAnnualPlan  the value for T_PLAN.IS_ANNUAL_PLAN
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setIsAnnualPlan(Byte isAnnualPlan) {
		this.isAnnualPlan = isAnnualPlan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.DESCRIPTION
	 * @return  the value of T_PLAN.DESCRIPTION
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.DESCRIPTION
	 * @param description  the value for T_PLAN.DESCRIPTION
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.WEIGHT
	 * @return  the value of T_PLAN.WEIGHT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.WEIGHT
	 * @param weight  the value for T_PLAN.WEIGHT
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.WEIGHT_PER
	 * @return  the value of T_PLAN.WEIGHT_PER
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Integer getWeightPer() {
		return weightPer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.WEIGHT_PER
	 * @param weightPer  the value for T_PLAN.WEIGHT_PER
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setWeightPer(Integer weightPer) {
		this.weightPer = weightPer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.PROGRESS
	 * @return  the value of T_PLAN.PROGRESS
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public Byte getProgress() {
		return progress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.PROGRESS
	 * @param progress  the value for T_PLAN.PROGRESS
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setProgress(Byte progress) {
		this.progress = progress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.PARENT_ID
	 * @return  the value of T_PLAN.PARENT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.PARENT_ID
	 * @param parentId  the value for T_PLAN.PARENT_ID
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_PLAN.PARENT_NAME
	 * @return  the value of T_PLAN.PARENT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_PLAN.PARENT_NAME
	 * @param parentName  the value for T_PLAN.PARENT_NAME
	 * @mbggenerated  Tue Nov 10 16:58:50 GMT+08:00 2015
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}