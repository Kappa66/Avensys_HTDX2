package com.java.string4;
import java.util.Scanner;

class Equals{
	 
	 int check(String str1, String str2) {
		 
		  int res = str1.compareTo(str2);
		  return res;
	 }
 }

public class LaunchApp {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the string 1");
		 String str1 = scan.next();
		 System.out.println("Enter the string 2");
		 String str2 = scan.next();
		Equals equals = new Equals();
		 int results = equals.check(str1, str2);
		 
		 if(results > 0) {
			 System.out.println("String 1 is greater than String 2");
		 }
		 else if (results < 0) {
			 System.out.println("String 2 is greater than String 1");
		 }
		 else {
			 System.out.println("String 1 and String 2 are equal");
		 }	

	}

}
