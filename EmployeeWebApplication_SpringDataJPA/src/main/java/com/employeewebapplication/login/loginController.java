package com.employeewebapplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class loginController {
	
	
	private AuthenticationService authService;
	
	public loginController(AuthenticationService authService) {
		super();
		this.authService= authService;
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String gotoLoginpage() {
		
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String username, 
			@RequestParam String password, ModelMap model) {
		if(authService.vaildateCredentials(username,password)) {
			model.put("name",username);
			return "welcome";
		}
		else {
			
		model.put("errorMessage", "Invalid Credenitals");
		return "login";
		}
	}
	
	

}
