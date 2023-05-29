package com.java.oop;


class Fan{
	
	String color;
	String brand;
	int no_of_wings;
	
	void blowAir() {
		
		System.out.println("Fan is running");
	}
	
	void rotate() {
		System.out.println("Fan is rotating");
	}
	
	void stop() {
		System.out.println("Fan is stopping");
	}
}

public class LaunchApp {

	public static void main(String[] args) {
		Fan fan1 =  new Fan();
		Fan fan2 =  new Fan();
		Fan fan3 =  new Fan();
		
		fan1.blowAir();
		fan2.rotate();
		fan3.stop();

	}

}
