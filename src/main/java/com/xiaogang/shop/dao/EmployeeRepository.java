package com.xiaogang.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaogang.shop.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
