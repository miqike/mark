package com.kysoft.kteam.plan.entity;

import java.util.Date;

public class Attachment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ATTACHMENT.PLAN_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String planId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ATTACHMENT.MONGO_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String mongoId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ATTACHMENT.NAME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ATTACHMENT.CONTENT_TYPE
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String contentType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ATTACHMENT.CREATE_TIME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ATTACHMENT.SIZE
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private Integer size;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ATTACHMENT.DISPATCH
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private Integer dispatch;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ATTACHMENT.PLAN_ID
	 * @return  the value of T_ATTACHMENT.PLAN_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getPlanId() {
		return planId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ATTACHMENT.PLAN_ID
	 * @param planId  the value for T_ATTACHMENT.PLAN_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ATTACHMENT.MONGO_ID
	 * @return  the value of T_ATTACHMENT.MONGO_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getMongoId() {
		return mongoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ATTACHMENT.MONGO_ID
	 * @param mongoId  the value for T_ATTACHMENT.MONGO_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setMongoId(String mongoId) {
		this.mongoId = mongoId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ATTACHMENT.NAME
	 * @return  the value of T_ATTACHMENT.NAME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ATTACHMENT.NAME
	 * @param name  the value for T_ATTACHMENT.NAME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ATTACHMENT.CONTENT_TYPE
	 * @return  the value of T_ATTACHMENT.CONTENT_TYPE
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ATTACHMENT.CONTENT_TYPE
	 * @param contentType  the value for T_ATTACHMENT.CONTENT_TYPE
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ATTACHMENT.CREATE_TIME
	 * @return  the value of T_ATTACHMENT.CREATE_TIME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ATTACHMENT.CREATE_TIME
	 * @param createTime  the value for T_ATTACHMENT.CREATE_TIME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ATTACHMENT.SIZE
	 * @return  the value of T_ATTACHMENT.SIZE
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ATTACHMENT.SIZE
	 * @param size  the value for T_ATTACHMENT.SIZE
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ATTACHMENT.DISPATCH
	 * @return  the value of T_ATTACHMENT.DISPATCH
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public Integer getDispatch() {
		return dispatch;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ATTACHMENT.DISPATCH
	 * @param dispatch  the value for T_ATTACHMENT.DISPATCH
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setDispatch(Integer dispatch) {
		this.dispatch = dispatch;
	}
}