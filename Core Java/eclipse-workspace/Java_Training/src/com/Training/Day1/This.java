package com.Training.Day1;

public class This {
	String name;
	
	This(String name){
		this(10,20);
		this.name = name;
		this.greet();
	}
	This(int a,int b){
		System.out.println("sum : " + (a+b));
	}
	
	void greet() {
		System.out.println("Wlecome " + name);
	}
	public static void main(String[] args) {
		This obj = new This("Murugesh");
	}

}
