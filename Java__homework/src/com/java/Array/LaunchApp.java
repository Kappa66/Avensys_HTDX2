package com.java.Array;
import java.util.Scanner;
public class LaunchApp {

	public static void main(String[] args) {
		//10 student age;
		//print to monitor screen
		int age[] =new int [10];
		System.out.println("====== for loop=======");
		Scanner scan = new Scanner(System.in);
		for(int i =0; i<age.length             ;i++) {
			System.out.println("Please enter Student "+i+" age");
			age[i]= scan.nextInt();
		}
		System.out.println();
		for(int i =0; i<10;i++) {
			System.out.println("Student"+i+"'s age: "+age[i]);
		}
		
		
		
	
	}

}
