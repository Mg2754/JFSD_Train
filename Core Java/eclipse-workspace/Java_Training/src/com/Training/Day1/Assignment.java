package com.Training.Day1;
import java.util.*;

class Student{
	int RegNo;
	int sub[] = new int[5];
	String name;
	int sum = 0;
	int avg = 0;
	
	
	Student(int RegNo,String name) {
		this.RegNo = RegNo;
		this.name = name;
		
	}
	void getMarks(){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<sub.length;i++) {
			sub[i] = sc.nextInt();
		}
		for(int i=0;i<sub.length;i++) {
			sum += sub[i];
		}
		avg = sum/sub.length;
	}
	void dispMarks() {
		
		System.out.println("Student Reg.No : "+ RegNo);
		System.out.println("Student Name : "+name);
		System.out.println("Subject Marks : "+Arrays.toString(sub));
		System.out.println("Total Mark : " + sum);
		System.out.println("Average Mark : "+ avg);
	}
	
	
}
public class Assignment {
	public static void main(String[] args) {
		Student obj = new Student(737734,"Murugesh");
		obj.getMarks();
		obj.dispMarks();
	}
}
