package com.Training.Day2;
class A{
	int a = 10;
	A(String name){
		System.out.println("Welcome : "+ name);
	}
	void myMethod() {
		System.out.println("I am Super Class");
	}	
}
class B extends A{
	B(){
		super("MG");
	}
	void myMethod1() {
		System.out.println("Supre class var : "+super.a);
		super.myMethod();
		
	}
}
public class Super {
	public static void main(String[] args) {
		B b = new B();
		b.myMethod1();
		
	}

}
