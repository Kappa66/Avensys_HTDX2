package com.java.array7;

import java.util.Scanner;

public class LaunchApp {

	public static void main(String[] args) {
		//3 dimension jagged array
		Scanner scan = new Scanner(System.in);
		
		int bankcust [][][]= new int[3][][];
		
		//Bank 1
		 bankcust[0] = new int[3][];
		 bankcust[0][0] = new int[4];
		 bankcust[0][1] = new int[2];
		 bankcust[0][2] = new int[3];
		 
		//Bank2
		 bankcust[1] = new int[4][];
		 bankcust[1][0] = new int[1];
		 bankcust[1][1] = new int[2];
		 bankcust[1][2] = new int[4];
		 bankcust[1][3] = new int[2];
		       
		 //Bank3
		 bankcust[2] = new int[2][];
		 bankcust[2][0] = new int[5];
		 bankcust[2][1] = new int[2];
		 
		
		for(int i=0;i<=bankcust.length-1;i++) {
			for(int j =0;j<=bankcust[i].length;j++) {
				for(int k = 0; k<=bankcust[i][j].length-1;k++) {
					System.out.println("Enter Bank "+
				(i+1)+" Branch "+(j+1)+" Cust "+(k+1)+"'s savings");
					bankcust[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for(int i=0;i<=bankcust.length-1;i++) {
			for(int j =0;j<=bankcust[i].length;j++) {
				for(int k = 0; k<=bankcust[i][j].length-1;k++) {
					System.out.println("Bank "+
							(i+1)+" Branch "+(j+1)+" "
							+ "Cust "+(k+1)+"'s savings "+bankcust[i][j][k]);
				}
			}
		}
	  
	

	}

}
