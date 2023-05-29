package com.java.loops4;

public class Pattern_Programs4 {

	public static void main(String[] args) {
		//Pattern One		
				for(int i =0;i<=4;i++) {
					for(int j =0,a ='E';j<=i;j++, a--) {
						System.out.print((char)(a));                       
					}
					System.out.println("");
				}
				System.out.println("");
				
				//Pattern Two				
				for(int i =4,a ='E';i>=0;i--,a--) {
					for(int g=0;g<4-i;g++) {			
						System.out.print(" ");			
					}
					for(int j =0;j<=i;j++) {
						System.out.print((char)(a-j));                       
					}
					System.out.println("");
				}
				System.out.println("");
				
				//Pattern Three			
				for(int i =0; i<=4;i++) {		
					for(int g=4;g>i;g--) {
						
						System.out.print(" ");				
					}
					
					for(int a=0, alpha ='A';a<=2*i;a++,alpha++) {				
						System.out.print((char)alpha);				
					}						
					System.out.println("");
				}
				System.out.println("");

	}

}
