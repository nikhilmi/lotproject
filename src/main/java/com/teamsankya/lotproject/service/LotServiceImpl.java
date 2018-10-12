package com.teamsankya.lotproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dto.LotBean;
@Service
public class LotServiceImpl implements LotService{
	@Autowired
	@Qualifier("dao")
	private LotDAO lotdao;

	
	
	@Override
	public LotBean getId(String id) {
		return lotdao.getId(id);
	}
	

}
