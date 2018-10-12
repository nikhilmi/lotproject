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




@Controller
public class LotController {
	@Autowired
	@Qualifier("service")
	private LotService lotService;
	
	final static Logger LOGGER=Logger.getLogger(LotController.class);

	@RequestMapping(path = "getid", method = RequestMethod.GET)
	public String getLOTId(ModelMap map,String lotId) {
		LOGGER.info("inside lot controller");
		LOGGER.info(lotId);
		LotBean bean= lotService.getId(lotId);
		
		map.addAttribute("bean",lotId);
		map.addAttribute("msg", "All 3 attributes are for this lot is available..");
		map.addAttribute("msg1", "Entered the lot id is invalid..");
		if(bean==null) {
			return "Failure";
		}
		else
		return "Success";
	}	


}
