package com.kysoft.cpsi.repo.mapper;

import java.util.List;
import java.util.Map;

import com.kysoft.cpsi.repo.entity.AuditItemEnterpriseType;
import com.kysoft.cpsi.repo.entity.AuditItemEnterpriseTypeKey;

public interface AuditItemEnterpriseTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_HCSX_QYLX
     *
     * @mbggenerated Mon Aug 08 17:16:05 CST 2016
     */
    int deleteByPrimaryKey(AuditItemEnterpriseTypeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_HCSX_QYLX
     *
     * @mbggenerated Mon Aug 08 17:16:05 CST 2016
     */
    int insert(AuditItemEnterpriseType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_HCSX_QYLX
     *
     * @mbggenerated Mon Aug 08 17:16:05 CST 2016
     */
    int insertSelective(AuditItemEnterpriseType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_HCSX_QYLX
     *
     * @mbggenerated Mon Aug 08 17:16:05 CST 2016
     */
    AuditItemEnterpriseType selectByPrimaryKey(AuditItemEnterpriseTypeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_HCSX_QYLX
     *
     * @mbggenerated Mon Aug 08 17:16:05 CST 2016
     */
    int updateByPrimaryKeySelective(AuditItemEnterpriseType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_HCSX_QYLX
     *
     * @mbggenerated Mon Aug 08 17:16:05 CST 2016
     */
    int updateByPrimaryKey(AuditItemEnterpriseType record);
    
    List<Map<String, Object>>  queryForAuditItem(Map<String, Object> param);
}