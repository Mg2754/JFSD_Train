package com.Training.Day1;

public class ConOverload {
	ConOverload(String name) {
		System.out.println("Welcome " + name);
	}
	ConOverload(int a,int b) {
		System.out.println("Add : " + (a+b));
	}
	ConOverload(int a) {
		System.out.println("number : " + a);
	}
	
	public static void main(String[] args) {
		ConOverload obj1 = new ConOverload("MG");
		ConOverload obj2 = new ConOverload(5);
		ConOverload obj3 = new ConOverload(10,20);
		
		
	}
	
}
