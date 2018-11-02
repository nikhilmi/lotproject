package com.teamsankya.lotproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.teamsankya.lotproject.dao.LotDAO;
import com.teamsankya.lotproject.dto.LotBean;
import com.teamsankya.lotproject.util.LotUtil;

/**
 * Here we are implementing LotDAO interface. see org.hibernate.SessionFactory
 * {@link Autowired} This is used for automatic dependency injection
 * {@link Qualifier} This is used to avoid conflicts in bean mapping and we need
 * to provide the bean name that will be used for autowiring
 * 
 * @author Praveen
 */
public class LotServiceImpl implements LotService {
	/**
	 * This is reference variable of LotDAO interface.
	 */
	@Autowired
	@Qualifier("dao")
	private LotDAO lotdao;

	private LotUtil lotUtil = new LotUtil();

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
	
    /**
     * This method will accept the string array of all the ids and will return
     *  a List of LotBean objects.
     *  It will validate all the ids by interacting with the LotUtil class.
     *  Based on valiation it will then get the data for each id by interacting 
     *  with the LotDAOHibernate class. 
     *  After getting the data for each id, it will add it to the List Object.
     *  Then it will return the List of LotBean Objects to the LotController class.
     *  @return List<LotBean>
	 *  @param  String []
	 *  
     *  @author Samarpita Das
     */
	public List<LotBean> getIds(String ids[]) {
		LotBean bean;
		List<LotBean> list = new ArrayList<LotBean>();
		for (String idValue : ids) {

			String id = lotUtil.toValidate(idValue);

			boolean res = lotUtil.validateAll(id);

			if (!res) {
				bean = new LotBean();
				bean.setLotId(idValue);
			} else {
				bean = lotdao.getId(idValue);
			}

			list.add(bean);

		}
		return list;

	}//end of getIds

}
