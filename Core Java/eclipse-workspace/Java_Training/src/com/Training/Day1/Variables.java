package com.Training.Day1;


public class Variables {
	int a = 20;
	static int b = 30;
	
	public static void main(String[] args) {
		int c = 25;
		System.out.println("Local var : "+ c);
		
		Variables obj1 = new Variables();
		System.out.println(obj1.a);
		
		System.out.println(Variables.b);
		
	}

}
