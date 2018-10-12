package com.teamsankya.lotproject.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dto.LotBean;

public class LotServiceImpl implements LotService{
	@Autowired
	private LotDAO lotdao;

	
	
	@Override
	public LotBean getId(String id) {
		return lotdao.getId(id);
	}
	

}
