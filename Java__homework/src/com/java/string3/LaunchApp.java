package com.java.string3;
import java.util.Scanner;
class Input {
	
	boolean check(String name) {
		char []ch = name.toCharArray();
		for(int i =0;i<ch.length;i++) {
			if(ch[i]=='s'||ch[i]=='S') {
				return true;
			}
		}
		 return false; 	 
	 }
}
public class LaunchApp {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		 System.out.println("Enter a name");
		 
		 String name = scan.next();
		 
		 Input input = new Input();
		 
		 boolean res = input.check(name);
		 
		 //System.out.print("The name contains letter s is "+res);
		 
		 if(res==true) {
			 System.out.println("String contains s");
		 }
		 else {
			 System.out.println("String does not contains s");
		 }
		

	}

}
