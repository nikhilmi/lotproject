package com.teamsankya.lotproject.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.lotproject.dto.LotBean;

public class LotDAOHibernateImpl implements LotDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public LotBean getId(String id) {
		System.out.println("inside DAOImplementation");
		LotBean bean = sessionFactory.getCurrentSession().get(LotBean.class, id);
		return bean;
	}

}
