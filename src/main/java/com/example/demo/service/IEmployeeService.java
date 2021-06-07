package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Employee;

public interface IEmployeeService {
	
	public List<Employee> listarEmployee();
	
	public Employee guardarEmployee(Employee employee);
	
	public Employee employeeCreate(Employee employee);
	
	public Employee actualizarEmployee(Employee employee);
	
	public void eliminarEmployee(Long id);

	Employee employeeID(Long id);

}
