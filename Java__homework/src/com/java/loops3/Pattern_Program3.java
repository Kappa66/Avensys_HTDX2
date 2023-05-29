package com.java.loops3;

public class Pattern_Program3 {

	public static void main(String[] args) {
		System.out.println(" ");
		for(int i = 5 ;i>=1;i--) {
			for(int j=5; j>=i;j--) {
				System.out.print(j+ " ");
			}
			System.out.println("");
		}

		System.out.println(" ");

		for(int i = 1 ;i<=5;i++) {
			for(int j=1; j<=i;j++) {
				if(j%2==1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}

	}

}
