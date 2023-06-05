package com.java.oopploymorphic;

class Teacher
{
	public void teach()
	{
		System.out.println("Teacher is teaching");
	}
	public void doExp()
	{
		System.out.println("Teacher is doing expreiment");
	}
}
class PhysicsTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Physics Teacher is teaching Physics");
	}
	public void doExp()
	{
		System.out.println("Physics teacher is doing expreiment");
	}
}
class ChemistryTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Chemistry Teacher is teaching Chemistry");
	}
	public void doExp()
	{
		System.out.println("Chemistry teacher is doing expreiment");
	}

}
class BiologyTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Biology Teacher is teaching Biology");
	}
	public void doExp()
	{
		System.out.println("Biology teacher is doing expreiment");
	}

}
class College
{
	public void acceptTeacher(Teacher ref)
	{
		ref.teach();
		ref.doExp();
	}
}
class LaunchApp extends Object {
	
	public static void main(String[] args) {
		PhysicsTeacher pt = new PhysicsTeacher(); 
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher(); 
		College c = new College();
		c.acceptTeacher(pt);
		c.acceptTeacher(ct);
		c.acceptTeacher(bt);
	} 
}