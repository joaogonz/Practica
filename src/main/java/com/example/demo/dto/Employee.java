package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name= "employee")
public class Employee {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private long id;
	
	@Column(name = "person")
	private String person;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "salary")
	private String salary;
	
	public Employee() {
		
	}



	public Employee(long id, String person, String position, String salary) {
		this.id = id;
		this.person = person;
		this.position = position;
		this.salary = salary;
		
		
		
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getPerson() {
		return person;
	}



	public void setPerson(String person) {
		this.person = person;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public String getSalary() {
		return salary;
	}



	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", person=" + person + ", position=" + position + ", salary=" + salary
				 + "]";
	}
	

	
	
	
}
