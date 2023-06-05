package com.java.oopinterface;

import java.util.Scanner;

interface CalculateSimpleInterest{
	public void acceptInput();
	public void findSI();
	public void display();
}

class BusinessMan1 implements CalculateSimpleInterest{
	int p;
	int t;
	static float r; // with static
	float SI;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		p = 3000;
		System.out.println("Principle Amount: "+p);		
		t = 3;
		System.out.println("Time: "+t);		
		r = 2f;
	}	
	public void findSI()
	{
		SI = (p*t*r)/100;
	}	
	public void display()
	{
		System.out.println("Simple Intrest is :" + SI);
	}
}

class BusinessMan2 implements CalculateSimpleInterest{
	int p;
	int t;
	static float r; // with static
	float SI;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		p = scan.nextInt();
		System.out.println("Enter the Time");
		t = scan.nextInt();
		r = 2f;
	}	
	public void findSI()
	{
		SI = (p*t*r)/100;
	}	
	public void display()
	{
		System.out.println("Simple Intrest is :" + SI);
	}
}

class BusinessMan3 implements CalculateSimpleInterest{
	int p;
	int t;
	static float r; // with static
	float SI;
	
	public void acceptInput()
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		p = scan.nextInt();
		
		while(p<=0){
			System.out.println("Enter an number more than Zero for Principle Amount ");
			System.out.println("Enter the Principle Amount");
			p = scan.nextInt();
			
		};		
		System.out.println("Enter the Time");
		t = scan.nextInt();		
		while(t<=0){
			System.out.println("Enter an number more than Zero for time ");
			System.out.println("Enter the time");
			t = scan.nextInt();
		};		
		r = 2f;		
	}	
	public void findSI()
	{
		SI = (p*t*r)/100;		
		if(SI<=0) {
			System.out.println("Invalild SI");
		}	
	}       	
	public void display()
	{
		System.out.println("Simple Intrest is :" + SI+"\n");
	}
}

class Business{
	public void acceptBusinessMan(CalculateSimpleInterest ref) {
		ref.acceptInput();
		ref.findSI();
		ref.display();
	}
}

class LaunchApp extends Object{
	
	public static void main(String[] args) {
		
		BusinessMan1 b1 =  new BusinessMan1();
		BusinessMan2 b2 =  new BusinessMan2();
		BusinessMan3 b3 =  new BusinessMan3();
		Business bus =  new Business();
		System.out.println("********Business Man 1********");
		bus.acceptBusinessMan(b1);
		System.out.println("********Business Man 2********");
		bus.acceptBusinessMan(b2);
		System.out.println("********Business Man 3********");
		bus.acceptBusinessMan(b3);
		
		
	} 
}
