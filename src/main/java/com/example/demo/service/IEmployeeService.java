package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Employee;

public interface IEmployeeService {
	
	public List<Employee> listEmployee();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee employeeCreate(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Long id);

	Employee employeeID(Long id);

}
