package com.teamsankya.lotproject.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.teamsankya.lotproject.dto.LotBean;
import com.teamsankya.lotproject.service.LotService;
import com.teamsankya.lotproject.util.LotUtil;

/**
 * This is a Controller class to interact with view and model
 * 
 * {@link LotController} Indicates that a particular class serves the role of a
 * controller. {@link RequestMapping} This specify what HTTP Request is handled
 * by the controller and by its method. {@link Autowired} This is used for
 * automatic dependency injection. {@link Qualifier} This is used to avoid
 * conflicts in bean mapping and we need to provide the bean name that will be
 * used for autowiring.
 * 
 * @author Prathibha
 */
@Controller
public class LotController {
	@Autowired
	@Qualifier("service")
	private LotService lotService;

	private LotUtil lotUtil = new LotUtil();

	final static Logger LOGGER = Logger.getLogger(LotController.class);

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
		String validLotId = lotUtil.validate(lotId);
		LotBean bean = lotService.getId(validLotId);
		map.addAttribute("bean", lotId);
		map.addAttribute("msg", "All 3 attributes are for this lot is available..");
		map.addAttribute("msg1", "Entered the lot id is invalid..");
		if (bean == null) {
			return "Failure";

		} else {
			if (bean.getActiveFlag().equalsIgnoreCase("Y") && bean.getSalesOrderNumber() != null
					&& bean.getCompletionClass() != null) {
				return "Success";
			}
			return "Failure";
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "error")
	public String errorPage() {
		return "error";
	}

	/**
	 * 
	 * This method will accept the file which is being uploaded through
	 * 'FileUpload.jsp'. Here data from the file is extracted using bytes[] and
	 * converted to String[] internally and stored in 'finalres'. Then data
	 * containing List of Lot Id in that file is being passed to service method, at
	 * last a processed list of filtered Lot Id is returned from service class and
	 * those are being stored in an 'lotbean' attribute. Finally the
	 * 'FileUploadSuccess' jsp page is being returned
	 * 
	 * @param map
	 * 
	 * @param file
	 * 
	 * @return FileUploadSuccess
	 * @author MI_NIKHIL
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("file") MultipartFile file, ModelMap map) throws IOException {

		String[] finalres = new String(file.getBytes()).split(",");
		List<LotBean> lotid = lotService.getIds(finalres);

		map.addAttribute("lotbean", lotid);

		return "FileUploadSuccess";

	}

}