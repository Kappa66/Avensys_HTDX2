package com.java.oopencap;

class Fan{
	int amount;
	
	public void setAmount(int x) {
		if(x>0) {
		amount = x;
		}
		else {
		System.out.println("Invalid amount");
		}
	}
	
	public int getAmount() {
		return amount;
	}
}
public class LaunchApp {

	public static void main(String[] args) {
		Fan fan= new Fan();
		 fan.setAmount(100);
		 System.out.println("Fan Amount: "+fan.getAmount());

	}

}
