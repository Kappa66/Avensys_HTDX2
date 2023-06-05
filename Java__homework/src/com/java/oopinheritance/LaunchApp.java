package com.java.oopinheritance;

/*inheritance is the process of one class 
 * accquiring the properties of another class*/
class DemoOne
{
	int a =10;
	int b =20;
	
	public void greet()
	{
		System.out.println("Hello Team!!");
	}
}
class DemoTwo extends DemoOne
{
	
}
public class LaunchApp extends Object {
	public static void main(String[] args) {
		//process of one class accquiring the properties of another class 
		DemoOne d1 = new DemoOne();
		d1.greet();
		System.out.println(d1.a);
		DemoTwo d2 = new DemoTwo();
		d2.greet();
		System.out.println(d2.a);
	}
}
