package com.Training.Day1.hands_on;
class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class Q1 {
	public static void main(String[] args) {
		Person obj = new Person("Neevan",20);
		
		System.out.println(obj.name + " "+ obj.age );		
		
	}

}
