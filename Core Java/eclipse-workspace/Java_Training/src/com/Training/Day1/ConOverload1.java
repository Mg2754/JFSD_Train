package com.Training.Day1;

public class ConOverload1 {
	ConOverload1(String name) {
		System.out.println("Welcome " + name);
	}
	ConOverload1(int a,int b) {
		this("MG");
		System.out.println("Add : " + (a+b));
	}
	ConOverload1(int a,String b,int c,int d) {
		this(10,20);
		System.out.println("number : " + a);
	}
	
	public static void main(String[] args) {
		ConOverload1 obj1 = new ConOverload1(5,"Murugesh",10,20);	
	}
	
}
