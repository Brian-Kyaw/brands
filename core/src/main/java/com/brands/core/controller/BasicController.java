package com.brands.core.controller;

import com.brands.core.dao.BasicDaoImpl;
import com.brands.core.models.Basic;
import com.day.cq.wcm.api.Page;

public class BasicController {

	public Basic getBasicHeaderFields(Page productPage, Boolean isAuthor) {
		BasicDaoImpl basicDaoImpl = new BasicDaoImpl();
		return basicDaoImpl.getBasicHeaderFields(productPage, isAuthor);
	}
}
