package com.Training.Day1.hands_on;

class Rectangle{
	int height;
	int width;
	int Area;
	
	Rectangle(int height,int width){
		this.height = height;
		this.width = width;
	}
	void calArea(){
		Area = (height*width);	
		System.out.println("Area of Rectangle : " + Area);
	}
	int calPerimeter() {
		int perimeter = (height + width) * 2;
		return perimeter;
	}
	
}

public class Q3 {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10,10);
		
		obj.calArea();
		System.out.println("Perimeter of Rectangle : " +obj.calPerimeter());
	}
}
