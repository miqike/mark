package com.kysoft.kteam.plan.entity;

import java.util.Date;

import net.sf.husky.tree.TreegridNode;

public class PlanAll extends TreegridNode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.IS_DEPT_PLAN
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Integer isDeptPlan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.OWNER_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String ownerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.OWNER_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String ownerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.DEP_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String depId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.DEP_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String depName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.CREATE_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.AUTHOR_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String authorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.AUTHOR_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String authorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.APPROVE_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Date approveTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.APPROVER_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String approverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.APPROVER_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String approverName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.CYCLE
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String cycle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.IMPORTANCE
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Integer importance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.INSTANCY
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Integer instancy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.STATUS
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.START_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.END_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.NEED_VERIFY
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Integer needVerify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.VERIFIER
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String verifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.IS_ANNUAL_PLAN
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private Integer isAnnualPlan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.DESCRIPT
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String descript;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.PARENT_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_PLAN_ALL.PARENT_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    private String parentName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.ID
     *
     * @return the value of T_PLAN_ALL.ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.ID
     *
     * @param id the value for T_PLAN_ALL.ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.NAME
     *
     * @return the value of T_PLAN_ALL.NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.NAME
     *
     * @param name the value for T_PLAN_ALL.NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.IS_DEPT_PLAN
     *
     * @return the value of T_PLAN_ALL.IS_DEPT_PLAN
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Integer getIsDeptPlan() {
        return isDeptPlan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.IS_DEPT_PLAN
     *
     * @param isDeptPlan the value for T_PLAN_ALL.IS_DEPT_PLAN
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setIsDeptPlan(Integer isDeptPlan) {
        this.isDeptPlan = isDeptPlan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.OWNER_ID
     *
     * @return the value of T_PLAN_ALL.OWNER_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.OWNER_ID
     *
     * @param ownerId the value for T_PLAN_ALL.OWNER_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.OWNER_NAME
     *
     * @return the value of T_PLAN_ALL.OWNER_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.OWNER_NAME
     *
     * @param ownerName the value for T_PLAN_ALL.OWNER_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.DEP_ID
     *
     * @return the value of T_PLAN_ALL.DEP_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getDepId() {
        return depId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.DEP_ID
     *
     * @param depId the value for T_PLAN_ALL.DEP_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setDepId(String depId) {
        this.depId = depId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.DEP_NAME
     *
     * @return the value of T_PLAN_ALL.DEP_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getDepName() {
        return depName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.DEP_NAME
     *
     * @param depName the value for T_PLAN_ALL.DEP_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.CREATE_TIME
     *
     * @return the value of T_PLAN_ALL.CREATE_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.CREATE_TIME
     *
     * @param createTime the value for T_PLAN_ALL.CREATE_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.AUTHOR_ID
     *
     * @return the value of T_PLAN_ALL.AUTHOR_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.AUTHOR_ID
     *
     * @param authorId the value for T_PLAN_ALL.AUTHOR_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.AUTHOR_NAME
     *
     * @return the value of T_PLAN_ALL.AUTHOR_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.AUTHOR_NAME
     *
     * @param authorName the value for T_PLAN_ALL.AUTHOR_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.APPROVE_TIME
     *
     * @return the value of T_PLAN_ALL.APPROVE_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Date getApproveTime() {
        return approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.APPROVE_TIME
     *
     * @param approveTime the value for T_PLAN_ALL.APPROVE_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.APPROVER_ID
     *
     * @return the value of T_PLAN_ALL.APPROVER_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getApproverId() {
        return approverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.APPROVER_ID
     *
     * @param approverId the value for T_PLAN_ALL.APPROVER_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setApproverId(String approverId) {
        this.approverId = approverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.APPROVER_NAME
     *
     * @return the value of T_PLAN_ALL.APPROVER_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getApproverName() {
        return approverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.APPROVER_NAME
     *
     * @param approverName the value for T_PLAN_ALL.APPROVER_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.CYCLE
     *
     * @return the value of T_PLAN_ALL.CYCLE
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.CYCLE
     *
     * @param cycle the value for T_PLAN_ALL.CYCLE
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.IMPORTANCE
     *
     * @return the value of T_PLAN_ALL.IMPORTANCE
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Integer getImportance() {
        return importance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.IMPORTANCE
     *
     * @param importance the value for T_PLAN_ALL.IMPORTANCE
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.INSTANCY
     *
     * @return the value of T_PLAN_ALL.INSTANCY
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Integer getInstancy() {
        return instancy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.INSTANCY
     *
     * @param instancy the value for T_PLAN_ALL.INSTANCY
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setInstancy(Integer instancy) {
        this.instancy = instancy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.STATUS
     *
     * @return the value of T_PLAN_ALL.STATUS
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.STATUS
     *
     * @param status the value for T_PLAN_ALL.STATUS
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.START_TIME
     *
     * @return the value of T_PLAN_ALL.START_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.START_TIME
     *
     * @param startTime the value for T_PLAN_ALL.START_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.END_TIME
     *
     * @return the value of T_PLAN_ALL.END_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.END_TIME
     *
     * @param endTime the value for T_PLAN_ALL.END_TIME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.NEED_VERIFY
     *
     * @return the value of T_PLAN_ALL.NEED_VERIFY
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Integer getNeedVerify() {
        return needVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.NEED_VERIFY
     *
     * @param needVerify the value for T_PLAN_ALL.NEED_VERIFY
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setNeedVerify(Integer needVerify) {
        this.needVerify = needVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.VERIFIER
     *
     * @return the value of T_PLAN_ALL.VERIFIER
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getVerifier() {
        return verifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.VERIFIER
     *
     * @param verifier the value for T_PLAN_ALL.VERIFIER
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.IS_ANNUAL_PLAN
     *
     * @return the value of T_PLAN_ALL.IS_ANNUAL_PLAN
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public Integer getIsAnnualPlan() {
        return isAnnualPlan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.IS_ANNUAL_PLAN
     *
     * @param isAnnualPlan the value for T_PLAN_ALL.IS_ANNUAL_PLAN
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setIsAnnualPlan(Integer isAnnualPlan) {
        this.isAnnualPlan = isAnnualPlan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.DESCRIPT
     *
     * @return the value of T_PLAN_ALL.DESCRIPT
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getDescript() {
        return descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.DESCRIPT
     *
     * @param descript the value for T_PLAN_ALL.DESCRIPT
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.PARENT_ID
     *
     * @return the value of T_PLAN_ALL.PARENT_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.PARENT_ID
     *
     * @param parentId the value for T_PLAN_ALL.PARENT_ID
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_PLAN_ALL.PARENT_NAME
     *
     * @return the value of T_PLAN_ALL.PARENT_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_PLAN_ALL.PARENT_NAME
     *
     * @param parentName the value for T_PLAN_ALL.PARENT_NAME
     *
     * @mbggenerated Mon Sep 21 14:49:25 GMT+08:00 2015
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}