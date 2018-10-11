package com.teamsankya.lotproject.service;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dto.LotDto;

public class LotServiceImpl implements LotService{
	
	private LotDAO lotdao;

	public void setLotdao(LotDAO lotdao) {
		this.lotdao = lotdao;
	}
	
	@Override
	public LotDto getId(LotDto bean) {
		return lotdao.getId(bean);
	}
	

}
