package com.teamsankya.lotproject.servicetest;

import org.apache.commons.pool.impl.GenericKeyedObjectPool.Config;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dao.LotDAOHibernateImpl;
import com.teamsankya.lotproject.service.LotService;
import com.teamsankya.lotproject.service.LotServiceImpl;

@Configuration
public class DAOImpleConfig {
	public static void main(String[] args) {
//	LotDAOHibernateImpl daoHibernateImpl=new LotDAOHibernateImpl();
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DAOImpleConfig.class);
		LotService implTest=applicationContext.getBean(LotService.class);
		LotDAO dao = applicationContext.getBean(LotDAO.class);
		System.out.println(implTest);
		System.out.println(dao);
		System.out.println(implTest.getId("2SQT34020.1"));
	}
	@Bean(name="dao")
	public LotDAO getLotDAO() {
		return new LotDAOHibernateImpl();
	}
	@Bean(name="service")
	public LotService getLotService() {
		return new LotServiceImpl();
	}
	@Bean
	public SessionFactory getSessionFactory() {
		return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
	}
}
