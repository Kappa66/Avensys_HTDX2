package com.java.arrayfindkey;
import java.util.Scanner;

public class LaunchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = scan.nextInt();
		
		System.out.println("Array is created with the size of "+len);
		System.out.println("Enter the elements");
	    int [] a =  new int [len];
		
		for(int i=0;i<=a.length-1;i++) {
			a[i]=scan.nextInt();
			System.out.print("");
		}
		
		System.out.println();
		
		System.out.println("Enter the key");
		 int key = scan.nextInt();
			System.out.print("");
		boolean found= false;
		int pos=0;
			
			
		for(int i =0;i<=a.length-1;i++) {
			if(key==a[i]) {
				 pos=i;
				 found = true;
			}
		}
		
		if(found) {
			System.out.print("Key in position "+pos);
		}
		else {
			System.out.print("Key not found");
		}
	}

}
