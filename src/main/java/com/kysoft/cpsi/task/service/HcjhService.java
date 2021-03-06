package com.kysoft.cpsi.task.service;

import java.util.Map;

import com.kysoft.cpsi.task.entity.Hcjh;

public interface HcjhService {

	void saveCheckList(String hcjhId, String[] hcsxIds);

	void audit(String hcjhId, Integer shzt);
	
	void dispatch(String hcjhId, Integer xdzt);

	String save(Hcjh hcjh);

	Map<String, Object> testDblink(String hcjhId);

	Map<String, Object> importDblink(String hcjhId);

	void reCalcAcceptStatus(String planId);

	void deleteCheckList(String hcjhId, String[] hcsxIds);

	boolean validateGsjh(String gsjhbh);

	void addEnterprise(String hcjhId, String[] zchs);
	
	void addEnterpriseShortcut(String hcjhId, String[] zchs);
	
	void removeEnterprise(String hcjhId, String[] hcrwIds);

	void delete(String hcjhId);

	void updateStatement(String hcjhId, String statement);

//	Map<String, Object> updateAcceptStatus(Map<String, Object> result);

}
