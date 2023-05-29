package com.java.oopconstructor3;

/* Local Chaining **/

class Object
{
	public Object()
	{
		// Intialise
	}
}
class Student extends Object
{
	private String name; 
	private int age;     
	private String city; 
	
	public Student() 
	{
		//super();
	}
	
	public Student(String name, int age, String city)
	{
		//One constructor calling other other constructor within the same class
		this();
		this.name = name;
		this.age = age;
		this.city = city;	
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
}

public class LaunchApp extends Object {
	
	public static void main(String[] args) {
		Student s = new Student("Siddu",23,"Singapore");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}
