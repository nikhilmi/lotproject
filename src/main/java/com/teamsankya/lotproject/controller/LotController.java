package com.teamsankya.lotproject.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamsankya.lotproject.dto.LotBean;
import com.teamsankya.lotproject.service.LotService;




@Controller
public class LotController {
	@Autowired
	private LotService lotservice;
	
	final static Logger LOGGER=Logger.getLogger(LotController.class);

	@RequestMapping(path = "getid", method = RequestMethod.GET)
	public String getLOTId(ModelMap map,String lotId) {
		LOGGER.info("inside lot controller");
		LotBean bean= lotservice.getId(lotId);
		map.addAttribute("bean",bean);
		if(bean==null) {
			return "failure";
		}
		else
		return "Success";
	}	


}
