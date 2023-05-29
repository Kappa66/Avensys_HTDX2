package com.java.oopstatic_instance;

//static block and method are unable to access instance variable
//as static block and methods are created first 
class Demo extends Object
{
	static int a,b,c;
	
	static
	{
		a=100;
		b=200;
		c=300;
		//Instance Error 
		//m=1000;
		//n=2000;
		//o=3000;
	}
	
	static void displayOne()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//Instance Error 
		//System.out.println(m);
		//System.out.println(n);
		//System.out.println(o);
	}
	
	int m,n,o;
	
	{
		m=10; 
		n=20; 
		o=30;
	}
	
	void displayTwo()
	{
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class LaunchApp extends Object {
	
	public static void main(String[] args) {
		Demo.displayOne();
		Demo d = new Demo();
		d.displayTwo();
	}
}
