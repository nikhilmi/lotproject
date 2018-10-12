package com.teamsankya.lotproject.service;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dto.LotBean;

public class LotServiceImpl implements LotService{
	
	private LotDAO lotdao;

	public void setLotdao(LotDAO lotdao) {
		this.lotdao = lotdao;
	}
	
	@Override
	public LotBean getId(LotBean bean) {
		return lotdao.getId(bean);
	}
	

}
