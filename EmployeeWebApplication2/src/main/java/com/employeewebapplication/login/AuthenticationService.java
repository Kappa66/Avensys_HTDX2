package com.employeewebapplication.login;

import org.springframework.stereotype.Service;

@Service 
public class AuthenticationService {

	public boolean vaildateCredentials(String username, String password) {
	
		if(username.equalsIgnoreCase("Alex")&&password.equalsIgnoreCase("password")) {
			return true;
		}
		else {
			return false;
		}
	}
}
