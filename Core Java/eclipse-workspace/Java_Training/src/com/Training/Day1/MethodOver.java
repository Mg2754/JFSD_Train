package com.Training.Day1;

public class MethodOver {
	void MethodOver(String name) {
		System.out.println("Welcome" + name);
	}
	void MethodOver(int a,int b) {
		System.out.println("Add : " + (a+b));
	}
	void MethodOver(int a) {
		System.out.println("number : " + a);
	}
	
	public static void main(String[] args) {
		MethodOver obj = new MethodOver();
		obj.MethodOver(5);
		obj.MethodOver("Raja");
		obj.MethodOver(4, 6);
	}
	
}
