package com.Training.Day2.hands_on;

class Animal{
	void makeSound() {
		System.out.println("Sound oF aniaml");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Bark");
	}
}

public class Q1 {
	public static void main(String args[]) {
		Animal obj = new Cat();
		obj.makeSound();
	}

}
