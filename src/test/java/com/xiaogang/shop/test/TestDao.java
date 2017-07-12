package com.xiaogang.shop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaogang.shop.dao.EmployeeRepository;
import com.xiaogang.shop.domain.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDao {
	
	@Autowired
	private EmployeeRepository  employeeRepository;
	
	@Test
	public void testEmp() throws Exception {
		Employee employee = new Employee();
		employee.setAge(11);
		employee.setName("xxx");
		employee.setPasswd("123456");
		employeeRepository.save(employee);
		
	}
}
