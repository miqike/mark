package com.kysoft.cpsi.audit.entity;

import java.util.Date;

public class StockRightChange {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.ID
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.ND
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private Integer nd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.XYDM
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private String xydm;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.GD
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private String gd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.BGQ_GQBL
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private Float bgqGqbl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.BGH_GQBL
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private Float bghGqbl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.BGRQ
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private String bgrq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_NB_GQBG.HCRW_ID
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	private String hcrwId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.ID
	 * @return  the value of T_NB_GQBG.ID
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.ID
	 * @param id  the value for T_NB_GQBG.ID
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.ND
	 * @return  the value of T_NB_GQBG.ND
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public Integer getNd() {
		return nd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.ND
	 * @param nd  the value for T_NB_GQBG.ND
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setNd(Integer nd) {
		this.nd = nd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.XYDM
	 * @return  the value of T_NB_GQBG.XYDM
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public String getXydm() {
		return xydm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.XYDM
	 * @param xydm  the value for T_NB_GQBG.XYDM
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setXydm(String xydm) {
		this.xydm = xydm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.GD
	 * @return  the value of T_NB_GQBG.GD
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public String getGd() {
		return gd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.GD
	 * @param gd  the value for T_NB_GQBG.GD
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setGd(String gd) {
		this.gd = gd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.BGQ_GQBL
	 * @return  the value of T_NB_GQBG.BGQ_GQBL
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public Float getBgqGqbl() {
		return bgqGqbl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.BGQ_GQBL
	 * @param bgqGqbl  the value for T_NB_GQBG.BGQ_GQBL
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setBgqGqbl(Float bgqGqbl) {
		this.bgqGqbl = bgqGqbl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.BGH_GQBL
	 * @return  the value of T_NB_GQBG.BGH_GQBL
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public Float getBghGqbl() {
		return bghGqbl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.BGH_GQBL
	 * @param bghGqbl  the value for T_NB_GQBG.BGH_GQBL
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setBghGqbl(Float bghGqbl) {
		this.bghGqbl = bghGqbl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.BGRQ
	 * @return  the value of T_NB_GQBG.BGRQ
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public String getBgrq() {
		return bgrq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.BGRQ
	 * @param bgrq  the value for T_NB_GQBG.BGRQ
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setBgrq(String bgrq) {
		this.bgrq = bgrq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_NB_GQBG.HCRW_ID
	 * @return  the value of T_NB_GQBG.HCRW_ID
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public String getHcrwId() {
		return hcrwId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_NB_GQBG.HCRW_ID
	 * @param hcrwId  the value for T_NB_GQBG.HCRW_ID
	 * @mbggenerated  Wed Jun 29 13:57:20 CST 2016
	 */
	public void setHcrwId(String hcrwId) {
		this.hcrwId = hcrwId;
	}
}