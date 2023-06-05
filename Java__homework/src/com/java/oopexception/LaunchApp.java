package com.java.oopexception;

import java.util.Scanner;

class UnderAgeException extends Exception{
	
	public String getMessage() {
		return "User under 18 is not allowed in MatchFinder";
	}
}

class OverAgeException extends Exception{
	public String getMessage() {
		return "User over 45 is not allowed in MatchFinder";
	}
}
class MatchFinder{
	
	int age;
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age: ");
		age = scan.nextInt();
	}
	public void verify() throws UnderAgeException, OverAgeException  {
		if(age<18) {
			UnderAgeException ue = new UnderAgeException();
			throw ue;
		}
		else if(age>45) {
			OverAgeException oe = new OverAgeException();
			throw oe;
		}
	}
}

class LaunchApp extends Object{
	public static void main(String[] args)  {
		MatchFinder mf = new MatchFinder();
		try {
			mf.acceptInput();
			mf.verify();		
		}
		catch(UnderAgeException ue) {
			System.out.println(ue.getMessage());
		}
		catch(OverAgeException oe) {
			System.out.println(oe.getMessage());
		}
	}
}