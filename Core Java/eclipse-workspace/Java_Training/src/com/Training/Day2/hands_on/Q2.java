package com.Training.Day2.hands_on;

class Vehicle{
	void drive(){
		System.out.println("Driving a Car");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Q2 {
	public static void main(String args[]){
		Vehicle obj = new Car();		
		obj.drive();
	}
}
