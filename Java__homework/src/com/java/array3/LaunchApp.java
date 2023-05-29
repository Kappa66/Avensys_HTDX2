package com.java.array3;

import java.util.Scanner;

public class LaunchApp {

	public static void main(String [] args) {
		
		//10 student age;
		//print to monitor screen
		int age[] =new int [10];
		System.out.println("=====while Loop==========");
		Scanner scan = new Scanner(System.in);
		int i =0;
		while(i<=age.length-1){
			System.out.println("Please enter Student "+i+" age");
			age[i]= scan.nextInt();
			i++;
		};
		
		System.out.println();
		
		int k=0;
		while(k<=age.length-1){
			System.out.println("Student"+k+"'s age: "+age[k]);
			k++;
		};
		
		
		
	
}

}
