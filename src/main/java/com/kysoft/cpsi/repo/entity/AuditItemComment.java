package com.kysoft.cpsi.repo.entity;

public class AuditItemComment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_HCSX_SM.ID
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_HCSX_SM.CONTENT
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_HCSX_SM.WEIGHT
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	private Integer weight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_HCSX_SM.HCSX_ID
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	private String hcsxId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_HCSX_SM.DBXXLY
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	private Integer dbxxly;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_HCSX_SM.ID
	 * @return  the value of T_HCSX_SM.ID
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_HCSX_SM.ID
	 * @param id  the value for T_HCSX_SM.ID
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_HCSX_SM.CONTENT
	 * @return  the value of T_HCSX_SM.CONTENT
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_HCSX_SM.CONTENT
	 * @param content  the value for T_HCSX_SM.CONTENT
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_HCSX_SM.WEIGHT
	 * @return  the value of T_HCSX_SM.WEIGHT
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_HCSX_SM.WEIGHT
	 * @param weight  the value for T_HCSX_SM.WEIGHT
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_HCSX_SM.HCSX_ID
	 * @return  the value of T_HCSX_SM.HCSX_ID
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public String getHcsxId() {
		return hcsxId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_HCSX_SM.HCSX_ID
	 * @param hcsxId  the value for T_HCSX_SM.HCSX_ID
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public void setHcsxId(String hcsxId) {
		this.hcsxId = hcsxId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_HCSX_SM.DBXXLY
	 * @return  the value of T_HCSX_SM.DBXXLY
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public Integer getDbxxly() {
		return dbxxly;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_HCSX_SM.DBXXLY
	 * @param dbxxly  the value for T_HCSX_SM.DBXXLY
	 * @mbggenerated  Fri Jul 22 08:38:10 CST 2016
	 */
	public void setDbxxly(Integer dbxxly) {
		this.dbxxly = dbxxly;
	}
}