package com.java.loops;

public class Pattern_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern one
		for(int i =1; i<=5;i++) {		
				for(int g=5;g>=i;g--) {
					
					System.out.print(" ");				
				}
				
				for(int a=1;a<=i;a++) {				
					System.out.print("* ");				
				}						
				System.out.println("");
		}
		System.out.println("");
		
		//Pattern Two
		for(int i =1; i<=5;i++) {	
			for(int g=5;g>=i;g--) {			
				System.out.print(" ");
				
			}
			
			for(int a=1;a<=i;a++) {			
				System.out.print("*");			
			}	
			
			System.out.println("");
		}
		System.out.println("");
		
		//Pattern Three
		for(int i = 5;i>=1;i--) {
			
			for(int a=1;a<=i;a++) {			
				System.out.print("* ");			
			}				
			System.out.println("");
			for(int g=i;g<=5;g++) {			
				System.out.print(" ");			
			}
		}
	

	}

}
