package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.dao.IEmployeeDao;
import com.example.demo.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	IEmployeeDao iEmployeeDao;
		

	@Override
	public List<Employee> listEmployee() {

		return iEmployeeDao.findAll();
		
		
	}

	@Override
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return iEmployeeDao.save(employee);
	}

	@Override
	public Employee employeeID(Long id) {
	
		return iEmployeeDao.findById(id).get();
	}
	
	@Override
	public Employee employeeCreate(Employee employee) {
	
		return iEmployeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return iEmployeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		
		iEmployeeDao.deleteById(id);
	}


}
