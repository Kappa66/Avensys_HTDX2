package com.employeewebapplication.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
	
	@Id
	private long id;
	@Size(min=5,message="Enter at least 5 characters")
	private String address;
	
	@Size(min=5,message="Enter at least 5 characters")
	private String name;
	
	@Min(value=18, message="Only Emmployee with age 18 and above ")
	private int age;
	
	public Employee() {}
	
	public Employee(long id,String name, String address, int age) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
