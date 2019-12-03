package com.brands.core.dao;


import com.brands.core.models.Basic;
import com.brands.core.utils.WCMUtil;
import com.day.cq.wcm.api.Page;

public class BasicDaoImpl implements BasicDao{

	@Override
	public Basic getBasicHeaderFields(Page brandPage, Boolean isAuthor) {
		// TODO Auto-generated method stub
		String basicPageTitle = WCMUtil.getPagePropertyValue(brandPage, "jcr:title");
		
		 Basic basic = new Basic();
		 basic.setTitle(basicPageTitle);
			
		return basic;
	}

}
