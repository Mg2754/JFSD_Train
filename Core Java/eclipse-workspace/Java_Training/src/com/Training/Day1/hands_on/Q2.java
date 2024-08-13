package com.Training.Day1.hands_on;

class Dog{
	String name;
	String breed;
	
	
	Dog(String name,String breed){
		this.name = name;
		this.breed  = breed;
	}
	
	void setter(String name,String breed) {
		this.name = name;
		this.breed = breed;
	}
	
}

public class Q2 {
	public static void main(String[] args) {
		Dog obj  = new Dog("Potter","Male");
		
		obj.setter("Harry", "Female");
		
		System.out.println("Dog Name : " + obj.name + " Dog Breed : " + obj.breed);	
	}

}
