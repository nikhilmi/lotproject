package com.teamsankya.lotproject.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamsankya.lotproject.dto.LotBean;
import com.teamsankya.lotproject.service.LotService;
import com.teamsankya.lotproject.util.LotUtil;
/**
 *  This is a Controller class to interact with view and model
 * 
 * {@link LotController} Indicates that a particular class serves the role of a controller.
 * {@link RequestMapping} This specify what HTTP Request is handled by the controller and by its method.
 * {@link Autowired} This is used for automatic dependency injection. 
 * {@link Qualifier} This is used to avoid conflicts in bean mapping and we need to provide the bean name that will be used for autowiring.
 *                      
 * @author  Prathibha
 */


@Controller
public class LotController {
	@Autowired
	@Qualifier("service")
	private LotService lotService;

	
	private LotUtil  lotUtil = new LotUtil();
	
	final static Logger LOGGER=Logger.getLogger(LotController.class);


	/**
	 * 
	 * @param map
	 * @param lotId
	 * @return success
	 */
	@RequestMapping(path = "getid", method = RequestMethod.GET)
	public String getLOTId(ModelMap map, String lotId) {
		LOGGER.info("inside lot controller");
		LOGGER.info(lotId);

		String validLotId= lotUtil.validate(lotId);
		LotBean bean= lotService.getId(validLotId);
		map.addAttribute("bean", lotId);
		map.addAttribute("msg", "All 3 attributes are for this lot is available..");
		map.addAttribute("msg1", "Entered the lot id is invalid..");
		if (bean == null) {
			return "Failure";

		}
		else
		{
			if(bean.getActiveFlag().equalsIgnoreCase("Y")) {
				return "Success";
			}
		return "Failure";
		}
	}	



}
