package com.brands.core.dao;

import com.brands.core.models.Basic;
import com.day.cq.wcm.api.Page;

public interface BasicDao {
	
	public Basic getBasicHeaderFields(Page brandPage, Boolean isAuthor);

}
