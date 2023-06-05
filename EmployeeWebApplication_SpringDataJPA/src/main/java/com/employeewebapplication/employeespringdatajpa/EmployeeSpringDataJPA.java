package com.employeewebapplication.employeespringdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeewebapplication.employee.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeSpringDataJPA extends JpaRepository<Employee,Long>{

	@Transactional 
	@Modifying(clearAutomatically = true)
	@Query("update Employee e set e.name = :name, e.address = :address, e.age= :age where e.id = :id")
	void updateEmployee(@Param("name") String name, 
			@Param("address") String address, @Param("age") int age, @Param("id") long id);	

}
