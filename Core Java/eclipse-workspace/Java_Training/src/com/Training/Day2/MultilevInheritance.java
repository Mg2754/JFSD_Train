package com.Training.Day2;

class TwoWheel{
	void wheels() {
		System.out.println("I have two wheels");
	}
}
class Bikes extends TwoWheel{
	void brandName() {
		System.out.println("Brand name is Bajaj");
	}
}
class VehColor extends Bikes{
	void color() {
		System.out.println("Bike Color is Black");
	}
}
public class MultilevInheritance {
	public static void main(String[] args) {
		VehColor veh = new VehColor();
		
		veh.wheels();
		veh.brandName();
		veh.color();
}
}