package com.java.array5;
import java.util.Scanner;
public class LauchApp {

	public static void main(String[] args) {
				
		
		//2 dimension jagged array
		int bankcust[][] = new int [5][];
		bankcust[0]= new int [3];
		bankcust[1]=new int[1];
		bankcust[2]=new int[4];
		bankcust[3]=new int[5];
		bankcust[4]=new int[2];
		
		Scanner scan= new Scanner(System.in);
		for(int i =0; i<=bankcust.length-1;i++) {
			for(int k=0;k<=bankcust[i].length-1;k++) {
				System.out.println("Enter customer "+
			(k+1)+"'s savings for bank "+(i+1));
				bankcust[i][k]=scan.nextInt();
			}
		}
		
		System.out.println();
		for(int i =0; i<=bankcust.length-1;i++) {
			for(int k=0;k<=bankcust[i].length-1;k++) {
				System.out.println("Customer "+(k+1)+"'s savings in bank "+(i+1)+": "
						+ ""+bankcust[i][k]);
			}
		} 
	
	}

}
