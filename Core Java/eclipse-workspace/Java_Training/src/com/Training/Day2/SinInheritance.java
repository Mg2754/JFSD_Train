package com.Training.Day2;

class TwoWheeler{
	void wheels() {
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("brand is honda");
	}
}
public class SinInheritance {
	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.wheels();
		bike.brandName();
	}

}
