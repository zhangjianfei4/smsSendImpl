package com.gate.mybatis.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gate.model.TdInfo;
import com.gate.mybatis.dao.TdInfoDAO;
/**
 * 
 * @author zjf
 * @time 11:47:17 AM
 */
@Service
public class TdInfoService {
		
	@Autowired
	private TdInfoDAO tdInfoDAO;

	public TdInfo getTdInfoBySn(int sn) {
		return tdInfoDAO.getTdInfoBySn(sn);
	}

	
	
}
