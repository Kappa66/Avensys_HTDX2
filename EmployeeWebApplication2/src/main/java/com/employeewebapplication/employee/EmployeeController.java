package com.employeewebapplication.employee;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class EmployeeController {
	
	private EmployeeService employeeservice;
	
	
	
	public EmployeeController(EmployeeService employeeservice) {
		super();
		this.employeeservice = employeeservice;
	}



	@RequestMapping(value="list-employees", method=RequestMethod.GET)
	public String gotoEmployeeRecords(ModelMap model) {
		
		List<Employee> employees = employeeservice.findAll();
		model.put("employees", employees);
		return "list-employees";
		
	}
	
	@RequestMapping(value="add-employees", method=RequestMethod.GET)
	public String gotoAddEmpPage(ModelMap model) {
		
		Employee employee =  new Employee(0,"Default name","",0);
		model.put("action", "Add");
		model.put("employee", employee);
		return "employee";
	}
	
	
	
	@RequestMapping(value="add-employees", method=RequestMethod.POST)
	public String addNewEmployee(ModelMap model, @Valid Employee employee,BindingResult result) {
		
		if(result.hasErrors()) {
			return "employee";
		}
		
		employeeservice.addEmployee(employee.getName(),employee.getAddress(),employee.getAge());		
		return "redirect:list-employees";
	}
	
	@RequestMapping(value="delete-employee", method = RequestMethod.GET)
	public String deleteEmployee(@RequestParam long id) {
		
		employeeservice.deleteById(id);
		
		return "redirect:list-employees";
		
	}
	
	@RequestMapping(value= "update-employee", method = RequestMethod.GET)
	public String gotoupdateEmployee(ModelMap model, @RequestParam long id) {
		Employee employee =  employeeservice.findById(id);
		model.addAttribute(employee);
		model.put("action", "Update");
		return "employee";
	}
	

	@RequestMapping(value= "update-employee", method = RequestMethod.POST)
	public String updateEmployee(ModelMap model, @Valid Employee employee, BindingResult result) {
		if(result.hasErrors()) {
			
			return "employee";
		}
		employeeservice.updateTodo(employee);
		
		return "redirect:list-employees";
	}

}
