package com.xiaogang.shop.web.controller.usr;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xiaogang.shop.domain.Employee;
import com.xiaogang.shop.service.usr.IEmployeeService;

@Controller
@RequestMapping("usr")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request, Integer page, Integer size) {
		ModelAndView mv = new ModelAndView("usr/list");
		PageRequest pageable = new PageRequest(page == null ? 0 : page, size == null ? 11 : size);
		Page<Employee> queryPage = employeeService.queryPage(pageable);
		mv.addObject("pageData", queryPage);
		return mv;
	}
	
}
