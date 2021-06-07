package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Long>{
	

}
