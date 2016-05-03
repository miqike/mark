package com.kysoft.kteam.plan.entity;

import java.util.Date;

public class Comment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_COMMENT.ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_COMMENT.PLAN_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String planId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_COMMENT.CONTENT
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_COMMENT.CREATE_TIME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_COMMENT.AUTHOR_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String authorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_COMMENT.AUTHOR_NAME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private String authorName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_COMMENT.DISPATCH
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	private Integer dispatch;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_COMMENT.ID
	 * @return  the value of T_COMMENT.ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_COMMENT.ID
	 * @param id  the value for T_COMMENT.ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_COMMENT.PLAN_ID
	 * @return  the value of T_COMMENT.PLAN_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getPlanId() {
		return planId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_COMMENT.PLAN_ID
	 * @param planId  the value for T_COMMENT.PLAN_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_COMMENT.CONTENT
	 * @return  the value of T_COMMENT.CONTENT
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_COMMENT.CONTENT
	 * @param content  the value for T_COMMENT.CONTENT
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_COMMENT.CREATE_TIME
	 * @return  the value of T_COMMENT.CREATE_TIME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_COMMENT.CREATE_TIME
	 * @param createTime  the value for T_COMMENT.CREATE_TIME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_COMMENT.AUTHOR_ID
	 * @return  the value of T_COMMENT.AUTHOR_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getAuthorId() {
		return authorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_COMMENT.AUTHOR_ID
	 * @param authorId  the value for T_COMMENT.AUTHOR_ID
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_COMMENT.AUTHOR_NAME
	 * @return  the value of T_COMMENT.AUTHOR_NAME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_COMMENT.AUTHOR_NAME
	 * @param authorName  the value for T_COMMENT.AUTHOR_NAME
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_COMMENT.DISPATCH
	 * @return  the value of T_COMMENT.DISPATCH
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public Integer getDispatch() {
		return dispatch;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_COMMENT.DISPATCH
	 * @param dispatch  the value for T_COMMENT.DISPATCH
	 * @mbggenerated  Tue Dec 01 13:11:53 CST 2015
	 */
	public void setDispatch(Integer dispatch) {
		this.dispatch = dispatch;
	}
}