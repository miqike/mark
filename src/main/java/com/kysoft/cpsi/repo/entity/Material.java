package com.kysoft.cpsi.repo.entity;

public class Material {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MATERIAL.ID
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MATERIAL.NAME
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MATERIAL.TYPE
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_MATERIAL.DXN_TYPE
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    private Integer dxnType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MATERIAL.ID
     *
     * @return the value of T_MATERIAL.ID
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MATERIAL.ID
     *
     * @param id the value for T_MATERIAL.ID
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MATERIAL.NAME
     *
     * @return the value of T_MATERIAL.NAME
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MATERIAL.NAME
     *
     * @param name the value for T_MATERIAL.NAME
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_MATERIAL.TYPE
     *
     * @return the value of T_MATERIAL.TYPE
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_MATERIAL.TYPE
     *
     * @param type the value for T_MATERIAL.TYPE
     *
     * @mbggenerated Mon Aug 08 09:14:15 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

	public Integer getDxnType() {
		return dxnType;
	}

	public void setDxnType(Integer dxnType) {
		this.dxnType = dxnType;
	}
    
    
}