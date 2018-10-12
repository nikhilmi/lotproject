package com.teamsankya.lotproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.lotproject.dto.LotDto;

public class LotDAOHibernateImpl implements LotDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public LotDto getId(LotDto bean) {
		System.out.println("inside DAOImplementation");
		Session session=sessionFactory.openSession();
		String hql="from LOT_FACT where lotId=:id";
		List<LotDto> bean1=null;
		Query query=session.createQuery(hql);
		query.setParameter("id",bean.getLotId() );
		bean1=(List<LotDto>) query.list();
		return bean;
	}

}
