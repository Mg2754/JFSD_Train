package com.Training.Day1.hands_on;

public class Q4 {
		float radius;
		double area;
		double circumfrence;
		
		Q4(float radius){
			this.radius = radius;
		}
		float getRadius() {
			return radius;
		}
		void setRadius(float radius) {
			this.radius = radius;
		}
		void calArea() {
			area = (radius*radius)*(3.14);
			System.out.println("Area of Circle : "+area);
		}
		void calCircum() {
			circumfrence = ((radius)*(3.14))*2;
			System.out.println("Circumstance of Circle : "+circumfrence);
		}
	public static void main(String[] args) {
		Q4 obj = new Q4(10);
		System.out.println("Radius : "+obj.getRadius());
		obj.calArea();
		obj.calCircum();
		obj.setRadius(15);
		System.out.println("Radius : "+obj.getRadius());
		obj.calArea();
		obj.calCircum();
	}

}
