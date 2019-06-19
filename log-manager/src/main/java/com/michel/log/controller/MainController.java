package com.michel.log.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.michel.log.entities.Log;

/**
 * Controladora principal
 * @author Michel Mendes	17/06/2019
 */
@Controller
public class MainController {
	
	private final String urlLogServices = "http://localhost:8080";
	private final String urlLog = urlLogServices + "/logs";
	
	@RequestMapping(value="/", method= RequestMethod.GET)	
	public String homeDefault(@RequestParam(value="idLog", required = false) Long idLog, Model model) {
		model.addAttribute("urlLog", urlLog);
		model.addAttribute("log", new Log());
		if (idLog != null) 
			model.addAttribute("idLog", idLog);
	    return "logList";
	}
	
	@RequestMapping(value="/dataLog", method= RequestMethod.GET)	
	public String dataLog(@RequestParam(value="idLog") Long idLog, Model model) {
		String urlLogData = urlLog + "/" + idLog + "/datas";
		model.addAttribute("urlLogData", urlLogData);
		model.addAttribute("idLog", idLog);
	    return "logDataList";
	}
	
}

