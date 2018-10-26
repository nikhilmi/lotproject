package com.teamsankya.lotproject.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.teamsankya.lotproject.dto.LotBean;

/**
 * Here we are implementing LotDAO interface. see org.hibernate.SessionFactory
 * {@link Autowired} This is used for automatic dependency injection
 * {@link Override} This is used for implementing abstract methods
 * @author Praveen
 */
public class LotDAOHibernateImpl implements LotDAO {
	/**
	 * Default Constructor
	 */
	public LotDAOHibernateImpl() {
		
	}

	/**
	 * SessionFactory is usually created during application start up and kept for
	 * later use.
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * This method interacts with the database and get the bean.
	 */
	@Override
	public LotBean getId(String id) {
		LotBean bean;
		try {
			bean = sessionFactory.getCurrentSession().get(LotBean.class, id);
		} catch (HibernateException e) {
			bean = sessionFactory.openSession().get(LotBean.class, id);
		}
		return bean;
	}

}
