package com.teamsankya.lotproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LotController {
	@Autowired
	

	@RequestMapping(path = "getid", method = RequestMethod.POST)
	public String getLOTId(ModelMap map) {
		
		return "getid";
	}


}
