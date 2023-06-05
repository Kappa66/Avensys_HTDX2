package com.employeewebapplication.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.employeewebapplication.employeespringdatajpa.EmployeeSpringDataJPA;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner{
	
	private EmployeeSpringDataJPA employeerepository;
	private long employeeid;
	
	public EmployeeCommandLineRunner(EmployeeSpringDataJPA employeerepository) {
		this.employeerepository = employeerepository;
	}
	
	public void run(String... args) {
		employeerepository.save(new Employee(++employeeid,"Jacob", "New York",29));
		employeerepository.save(new Employee(++employeeid,"Peter", "Orlando",34));
		employeerepository.save(new Employee(++employeeid,"Howard", "Portland",45));
	}

}
