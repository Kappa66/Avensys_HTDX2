package com.java.oopstatic;

import java.util.Scanner;


public class LaunchApp {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.acceptInput();
		student1.display();
		
		student2.acceptInput();
		student2.display();
		
		student3.acceptInput();
		student3.display();
	}
}

class Student{
	String name;
	int age;
	int marks;
	static String collegename;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Student Name");
		name = scan.next();
		System.out.println("Enter the Student Age");
		age = scan.nextInt();
		System.out.println("Enter the Student Marks");
		marks = scan.nextInt();
		System.out.println("Enter the Student college");
		collegename = scan.next();
	}
	
	public void display()
	{
		System.out.println("**************************");
		System.out.println("Student Name :" + name);
		System.out.println("Student Age :" + age);
		System.out.println("Student Marks :" + marks);
		System.out.println("Student College Name :" + collegename);
		System.out.println("**************************");
	}	
}