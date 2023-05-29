package com.java.array6;

import java.util.Scanner;

public class LaunchApp {

	public static void main(String[] args) {
		
			
	//3 Dimension Array
			Scanner scan = new Scanner(System.in);
			
			int colleges [][][]=new int[3][3][4];
			
			for(int i=0;i<=colleges.length-1;i++) {
				for(int j =0;j<=colleges[i].length;j++) {
					for(int k = 0; k<=colleges[i][j].length-1;k++) {
						System.out.println("Enter College "+
					(i+1)+" Class "+(j+1)+" Student "+(k+1)+"'s marks");
						colleges[i][j][k] = scan.nextInt();
					}
				}
			}
			
			for(int i=0;i<=colleges.length-1;i++) {
				for(int j =0;j<=colleges[i].length;j++) {
					for(int k = 0; k<=colleges[i][j].length-1;k++) {
						System.out.println("College "+
					(i+1)+" Class "+(j+1)+" Student "+(k+1)+"'s marks "+ 
								colleges[i][j][k]);	
					}
				}
			}
				

	}

}
