package com.momo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {
	
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}
	
	@RequestMapping(value = { "/test"}, method = RequestMethod.GET)
	public String testPage(ModelMap model) {
		return "test";
	}
	
	@RequestMapping(value = { "/momo"}, method = RequestMethod.GET)
	public String momoPage(ModelMap model) {
		return "momo";
	}
	
}
