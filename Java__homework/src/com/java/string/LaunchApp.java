package com.java.string;

public class LaunchApp {

	public static void main(String[] args) {
		String str1 = new String("Have a Good Day");
		 System.out.println(str1);
		 System.out.println("******************************");
		 System.out.println(str1.toUpperCase());
		 System.out.println("******************************");
		 System.out.println(str1.toLowerCase());
		 System.out.println("******************************");
		 System.out.println(str1.contains("Good"));
		 System.out.println("******************************");
		 System.out.println(str1.contains("Day"));
		 System.out.println("******************************");
		 System.out.println(str1.indexOf('a'));
		 System.out.println("******************************");
		 System.out.println(str1.charAt(3));
		 System.out.println("******************************");
		 System.out.println(str1.substring(7));
		 System.out.println("******************************");
		 System.out.println(str1.substring(7,11));

	}

}
