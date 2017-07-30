package com.xiaogang.shop.service.usr.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xiaogang.shop.dao.EmployeeRepository;
import com.xiaogang.shop.domain.Employee;
import com.xiaogang.shop.log.LoggerAble;
import com.xiaogang.shop.service.usr.IEmployeeService;

@Service
public class EmployeeServiceImpl extends LoggerAble implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee add(Employee t) {
		logger.info("add {}",t);
		return employeeRepository.save(t);
	}

	@Override
	public void del(Employee t) {
		employeeRepository.delete(t);
	}

	@Override
	public Employee get(Serializable id) {
		
		return employeeRepository.getOne((Long) id);
	}

	@Override
	public Page<Employee> queryPage(Pageable pageable) {
		Page<Employee> findAll = employeeRepository.findAll(pageable);
		return findAll;
	}
}
