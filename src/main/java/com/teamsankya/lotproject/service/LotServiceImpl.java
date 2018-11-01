package com.teamsankya.lotproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dto.LotBean;
/**
 * Here we are implementing LotDAO interface. see org.hibernate.SessionFactory
 * {@link Autowired} This is used for automatic dependency injection
 * {@link Qualifier} This is used to avoid conflicts in bean mapping and we need to
 * provide the bean name that will be used for autowiring
 * @author Praveen
 */
public class LotServiceImpl implements LotService{
	/**
	 * This is reference variable of LotDAO interface.
	 */
	@Autowired
	@Qualifier("dao")
	private LotDAO lotdao;

	/**
	 * Default Constructor
	 */
	public LotServiceImpl() {
		
	}
	
	/**
	 * This method interacts with the database and get the lotid.
	 */
	@Override
	public LotBean getId(String id) {
		return lotdao.getId(id);
	}
	

}
