package com.java.loops2;

public class Pattern_Program2 {

	public static void main(String[] args) {
		System.out.println("======Heart Shape=======");
		for(int i =0; i<=5;i++) {		


		for(int a=0;a<=6;a++) {	
			if((i==0&&a>0&&a!=3&&a!=6)||(i==1&&a%3==0)||(i-a==2)||(i+a==8)) {
				System.out.print("*");		
			}
			else		
			{
				System.out.print(" ");	
			}
		}						
		System.out.println("");
		} 
		System.out.println();

		System.out.println("======Arrow UP=======");

		for(int i =0; i<=4;i++) {	


		for(int a=0;a<=8;a++) {	
			if((i+a==4)||(a-i==4)) {
				System.out.print("*");		
			}
			else		
			{
				System.out.print(" ");	
			}
		}						
		System.out.println("");
		}

	}

}
