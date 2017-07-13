package com.xiaogang.shop.web.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xiaogang.shop.service.usr.IEmployeeService;

@Controller
@RequestMapping
public class HomeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
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
