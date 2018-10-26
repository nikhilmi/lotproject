package com.teamsankya.lotproject.dao;

import com.teamsankya.lotproject.dto.LotBean;

/**
 * We perform Database connectivity, configuration and interaction 
 * and giving response back to servce
 * @author Praveen
 */
public interface LotDAO {
	/**
	 * 
	 * @param id
	 * @return the Object of LotBean
	 */
	public LotBean getId(String id);

}
