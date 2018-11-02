package com.teamsankya.lotproject.service;

import java.util.List;

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

	public List<LotBean> getIds(String ids[]);
	
}
