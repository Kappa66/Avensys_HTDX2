package com.java.string2;

public class LaunchApp {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Have a Good Day");
		 StringBuilder str2 = new StringBuilder("Good Morning");
		 System.out.println(str1);
		 System.out.println("*******str1.equals(str2)******");
		 System.out.println(str1.equals(str2));
		 System.out.println("\n*******str1.compareTo(str2)***");
		 System.out.println(str1.compareTo(str2));
		 System.out.println("\n******str1.charAt(4)**********");
		 System.out.println(str1.charAt(4));
		 System.out.println("\n******str1.substring(3)*******");
		 System.out.println(str1.substring(3));
		 System.out.println("\n******str1.substring(3,7)*****");
		 System.out.println(str1.substring(3,7));
		 System.out.println("\n**str1.append(\", Keep Going \")***");
		 System.out.println(str1.append(", Keep Going "));
		 System.out.println("\n******str1.insert(5,\"aaaaaaa\")******");
		 System.out.println(str1.insert(5,"aaaaaaa"));
		 System.out.println("\n*******str1.reverse()*********");
		 System.out.println(str1.reverse());
		 System.out.println("\n******Before str1.ensureCapacity(89)***********");
		 System.out.println(str1.capacity()); 
		 
		 str1.ensureCapacity(89);
		 System.out.println("\n*****After str1.ensureCapacity(89)*********");
		 System.out.println("String Capcity is "+str1.capacity());
		 System.out.println("\n******str1.length()*************");
		 System.out.println(str1.length()); 
		 System.out.println("\n******str1.capacity()***********");
		 System.out.println(str1.capacity()); 

	}

}
