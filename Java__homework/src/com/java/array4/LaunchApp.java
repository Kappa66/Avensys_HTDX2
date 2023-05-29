package com.java.array4;
import java.util.Scanner;
public class LaunchApp {

public static void main(String[] args) {
		
		//banks =5 3 customer
		int savings[][]= new int[5][3];
		
		Scanner scan= new Scanner(System.in);
		for(int i =0; i<=savings.length-1;i++) {
			for(int k=0;k<=savings[i].length-1;k++) {
				System.out.println("Enter customer "+(k+1)+"'s savings for bank "+(i+1));
				savings[i][k]=scan.nextInt();
			}
		}
		
		System.out.println();
		for(int i =0; i<=savings.length-1;i++) {
			for(int k=0;k<=savings[i].length-1;k++) {
				System.out.println("Customer "+(k+1)+"'s savings in bank "+(i+1)+": "+savings[i][k]);
			}
		} 
		
		       
	}

}
