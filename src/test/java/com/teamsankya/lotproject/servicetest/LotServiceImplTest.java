package com.teamsankya.lotproject.servicetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dao.LotDAOHibernateImpl;
import com.teamsankya.lotproject.dto.LotBean;
import com.teamsankya.lotproject.service.LotService;
import com.teamsankya.lotproject.service.LotServiceImpl;
import com.teamsankya.lotproject.util.LotUtil;

import junit.framework.TestCase;

public class LotServiceImplTest extends TestCase {
	
	
	@Test
	public void testGetIds()
	{
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(DAOImpleConfig.class);
		String[] ids= {"2SQT340.1"};
		LotService servimp=applicationContext.getBean(LotService.class);
		List<LotBean> actual= servimp.getIds(ids);
		
		
		// valid data...	
		assertEquals(actual.get(0).getCustomerId(),3000001878l);
		assertEquals(actual.get(0).getCompletionClass(), "WIP");
		assertEquals(actual.get(0).getSalesOrderNumber(), "8020026842:07:01");
		assertEquals(actual.get(0).getActiveFlag(),"Y");
		
		/// Invalid data...
		/*assertEquals(actual.get(1).getLotId(),"2SQT34020.2");
		assertEquals(actual.get(1).getCustomerId(),3000001878l);
		assertEquals(actual.get(1).getCompletionClass(), "WIP");
		assertEquals(actual.get(1).getSalesOrderNumber(), "8020026842:07:01");
		assertEquals(actual.get(1).getActiveFlag(),"Y");*/
	}
	}