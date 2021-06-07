package com.example.dao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	
	@GetMapping("/employee")
	public List<Employee>  listarEmployee(){
		
		return employeeServiceImpl.listarEmployee();
		
	}
	
	@PostMapping("/employee")
	public Employee guardarEmployee(@RequestBody Employee employee) {
		
		return employeeServiceImpl.guardarEmployee(employee);
		
	}

	@PutMapping("/employee/{id}")
	public Employee employeeCreate(@RequestBody Employee employee) {
		
		Employee  employee_create = new Employee();
		
		employee_create.setPerson(employee.getPerson());
		employee_create.setPosition(employee.getPosition());
		employee_create.setSalary(employee.getSalary());
		
		
		return employee_create;
	}
	
	@PutMapping("/employee/{id}")
	public Employee actualizarEmployee(@PathVariable(name= "id") Long id,@RequestBody Employee employee) {
		
		Employee  employee_select = new Employee();
		Employee  employee_update = new Employee();
		
		employee_select = employeeServiceImpl.employeeID(id);
		
		employee_select.setPerson(employee.getPerson());
		employee_select.setPosition(employee.getPosition());
		employee_select.setSalary(employee.getSalary());
		
		employee_select = employeeServiceImpl.actualizarEmployee(employee_select);
		
		return employee_update;
	}
	
	@DeleteMapping("/employee/{id}")
	public void eliminarEmployee(@PathVariable(name = "id") Long id) {
		
		employeeServiceImpl.eliminarEmployee(id);
		
	}
}
