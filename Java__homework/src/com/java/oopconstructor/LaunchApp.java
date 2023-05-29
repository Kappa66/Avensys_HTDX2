package com.java.oopconstructor;

class Student
{
	private String name;
	private int age;
	private String city;
	
	public Student(String x, int y, String z)
	{
		name = x;
		age = y;
		city = z;
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

public class LaunchApp {
	
	public static void main(String[] args) {
	//Constructor are specialize setter, but no return type
		Student s = new Student("Siddu",23,"Singapore");
		//s.setData("Siddu", 23, "Singapore");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}
