package com.java.oopinheritance1;

import com.java.oopinheritance1.DemoTwo;

//Rule 1: Private member will not participate in inheritance
class DemoOne{
	private int a = 10;
	int b = 30;
	
	public void greet() {
		System.out.println("Hello Team");
	}
}

class DemoTwo extends DemoOne
{
	
}

public class LaunchApp extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoOne d1 = new DemoOne();
		d1.greet();
		System.out.println(d1.a);
		DemoTwo d2 = new DemoTwo();
		d2.greet();
		System.out.println(d2.a);//Second object is getting issue while accessin a avriable
	}

}
