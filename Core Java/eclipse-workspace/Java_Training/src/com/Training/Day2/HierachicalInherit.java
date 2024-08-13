package com.Training.Day2;

class TwoWheel1{
	void wheels() {
		System.out.println("I have two wheels");
	}
}
class Bikes1 extends TwoWheel1{
	void brandName() {
		System.out.println("Brand name is Bajaj");
	}
}
class Scooter extends TwoWheel1{
	void brandName() {
		System.out.println("Brand name is TVS");
	}
}

public class HierachicalInherit {
	public static void main(String[] args) {
		Bikes1 bike = new Bikes1();
		
		bike.wheels();
		bike.brandName();
		
		Scooter scooter = new Scooter();
		
		
		scooter.wheels();
		scooter.brandName();
		
		
}
}