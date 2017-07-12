package com.xiaogang.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HomeController {
	
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home/home");

		return mv;
	}
	
	@RequestMapping("/main_m")
	public ModelAndView main_m() {
		ModelAndView mv = new ModelAndView("home/main_m");

		return mv;
	}
}
