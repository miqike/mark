package com.kysoft.cpsi.task.mapper;

import com.kysoft.cpsi.task.entity.Hcclmx;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface HcclmxMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCCLMX
     *
     * @mbggenerated Fri May 27 16:40:14 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCCLMX
     *
     * @mbggenerated Fri May 27 16:40:14 CST 2016
     */
    int insert(Hcclmx record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCCLMX
     *
     * @mbggenerated Fri May 27 16:40:14 CST 2016
     */
    int insertSelective(Hcclmx record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCCLMX
     *
     * @mbggenerated Fri May 27 16:40:14 CST 2016
     */
    Hcclmx selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCCLMX
     *
     * @mbggenerated Fri May 27 16:40:14 CST 2016
     */
    int updateByPrimaryKeySelective(Hcclmx record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table T_HCCLMX
     *
     * @mbggenerated Fri May 27 16:40:14 CST 2016
     */
    int updateByPrimaryKey(Hcclmx record);

    List<Hcclmx> queryForTask(Map<String, Object> paramMap);

    Hcclmx selectBy(@Param("hcrwId") String hcrwId, @Param("hcsxId") String hcsxId, @Param("hcdwXydm") String hcdwXydm, @Param("hcjhnd") Integer hcjhnd, @Param("hcclId") String hcclId);

    List<Hcclmx> queryDocFurForTask(Map<String, Object> paramMap);

	Hcclmx selectByPrimaryKey2(String id);

	void deleteByPrimaryKey2(String id);

	void insert2(Hcclmx hcclmx);

	void updateByPrimaryKeySelective2(Hcclmx hcclmx);
    
}