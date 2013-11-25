package com.gate.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gate.mybatis.service.EhCacheService;
import com.gate.mybatis.service.TdInfoService;

/**
 * 
 * @author 1202211
 * 
 */
@Controller
public class TdInfoController{
	
	
	@Autowired
	private TdInfoService tdInfoService;
	@Autowired
	private EhCacheService ehCacheService;
	
	/**
	 * չʾ����ͨ����Ϣ
	 */
	@RequestMapping("/tdInfoList.do")
	public String tdInfoList(HttpServletRequest request, ModelMap modelMap) {
		System.out.println(tdInfoService.getTdInfoBySn(1));
		ehCacheService.putCache("test", "valuekey");
		
		String str=(String) ehCacheService.getCache("test");
		System.out.println(str);
		return "/manager/td/tdInfoList";
	}
	
	
	
}
