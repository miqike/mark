package com.kysoft.cpsi.task.service;

import java.util.Map;

import com.kysoft.cpsi.task.entity.Hcjh;

public interface HcjhService {

	void saveCheckList(String hcjhId, String[] hcsxIds);

	void audit(String hcjhId, Integer shzt);

	String save(Hcjh hcjh);

	Map<String, Object> testDblink();

	Map<String, Object> importDblink(String hcjhId);

	void reCalcAcceptStatus(String planId);

	void deleteCheckList(String hcjhId, String[] hcsxIds);

	boolean validateGsjh(String gsjhbh);

//	Map<String, Object> updateAcceptStatus(Map<String, Object> result);

}
