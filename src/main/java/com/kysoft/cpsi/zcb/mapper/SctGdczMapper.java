package com.kysoft.cpsi.zcb.mapper;

import com.kysoft.cpsi.zcb.entity.SctGdcz;
import com.kysoft.cpsi.zcb.entity.SctGdczKey;

public interface SctGdczMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCT_GDCZ
     *
     * @mbg.generated Tue Jan 03 14:17:25 CST 2017
     */
    int deleteByPrimaryKey(SctGdczKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCT_GDCZ
     *
     * @mbg.generated Tue Jan 03 14:17:25 CST 2017
     */
    int insert(SctGdcz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCT_GDCZ
     *
     * @mbg.generated Tue Jan 03 14:17:25 CST 2017
     */
    int insertSelective(SctGdcz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCT_GDCZ
     *
     * @mbg.generated Tue Jan 03 14:17:25 CST 2017
     */
    SctGdcz selectByPrimaryKey(SctGdczKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCT_GDCZ
     *
     * @mbg.generated Tue Jan 03 14:17:25 CST 2017
     */
    int updateByPrimaryKeySelective(SctGdcz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCT_GDCZ
     *
     * @mbg.generated Tue Jan 03 14:17:25 CST 2017
     */
    int updateByPrimaryKey(SctGdcz record);
}