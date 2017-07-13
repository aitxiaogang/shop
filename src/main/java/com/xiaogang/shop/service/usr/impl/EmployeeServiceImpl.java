package com.xiaogang.shop.service.usr.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaogang.shop.dao.EmployeeRepository;
import com.xiaogang.shop.domain.Employee;
import com.xiaogang.shop.service.usr.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee add(Employee t) {
		Employee employee = employeeRepository.save(t);
		return employee;
	}

	@Override
	public void del(Employee t) {
		employeeRepository.delete(t);
	}

	@Override
	public Employee get(Serializable id) {
		Employee employee = employeeRepository.findOne(Long.valueOf(id+""));
		return employee;
	}

}
