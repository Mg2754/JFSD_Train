package com.Training.Day1;

class Employee{
	int empId;
	String empName;
	float empSalary;
	
	//constructior
	Employee(int empId,String empName,float empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
	}
}

public class Hello {
	public static void main(String args[]) {
		Employee emp1 = new Employee(101,"MG",1000.00f);
		emp1.display();
		
	}

}
