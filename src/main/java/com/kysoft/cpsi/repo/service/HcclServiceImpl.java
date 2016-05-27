package com.kysoft.cpsi.repo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kysoft.cpsi.repo.entity.Hccl;
import com.kysoft.cpsi.repo.mapper.HcclMapper;

@Service("hcclService")
public class HcclServiceImpl implements HcclService {


	@Resource 
	HcclMapper hcclMapper;

	@Override
	public List<Hccl> getHcclCode(String hcsxId) {
		return hcclMapper.selectByHcsxId(hcsxId);
	}

}