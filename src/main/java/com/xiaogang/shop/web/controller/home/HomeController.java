package com.xiaogang.shop.web.controller.home;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping(value = "/json", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> name() {
		Map<String, String> map = new HashMap<>();
		map.put("xxx", "sdfa");
		return map;
	}
	
}
