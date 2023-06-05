package com.employeewebapplication.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


import jakarta.validation.Valid;

@Service
public class EmployeeService{
	
	private static List<Employee> employees= new ArrayList<>();
	private static long employeeid;
	
	
	
	
	static {
		
		employees.add(new Employee(++employeeid,"Jacob", "New York",29));
		employees.add(new Employee(++employeeid,"Peter", "Orlando",34));
		employees.add(new Employee(++employeeid,"Howard", "Portland",45));
		
		
		
	}
	
	
	public List<Employee> findAll(){
				
		return employees;
		
	}
	
	public void addEmployee(String name, String address, int age) {
		
		
		employees.add(new Employee(++employeeid,name,address,age));	
	}
	
	public void deleteById(long id)
	{
		Predicate<? super Employee> predicate = employee -> employee.getId()==id;
		employees.removeIf(predicate);	
	}
	
	public Employee findById(long id)
	{
		Predicate<? super Employee> predicate = employee -> employee.getId()==id;
		Employee employee = employees.stream().filter(predicate).findFirst().get();
		return employee;		
	}
	
	public void updateTodo(@Valid Employee employee) {
		Predicate<? super Employee> predicate = emp-> emp.getId()==employee.getId();		
		int index  = employees.indexOf(employees.stream().filter(predicate).findFirst().get());
		employees.set(index, employee);	}

}
