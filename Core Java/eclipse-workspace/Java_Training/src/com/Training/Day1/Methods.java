package com.Training.Day1;

public class Methods {
	void myMethod1() {
		System.out.println("Instance or Object MEthod");
	}
	static void myMethod2() {
		System.out.println("Sstic or class method");
	}
	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.myMethod1();
		
		Methods.myMethod2();
		
	}

}
