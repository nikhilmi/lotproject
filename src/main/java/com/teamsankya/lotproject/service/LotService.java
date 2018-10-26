package com.teamsankya.lotproject.service;

import com.teamsankya.lotproject.dto.LotBean;

/**
 * In this LotService, we can write some  business logics to 
 * communicate with DAO and give the response to controller
 *	@author Praveen
 */
public interface LotService {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public LotBean getId(String id);
	
}
