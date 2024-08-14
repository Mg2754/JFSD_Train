package hands_on;

class Shape{
	int getArea(int width,int height){
		int Area = width + height;
		return Area;
	}
}
class Rectangle extends Shape{
	int getArea(int width, int height) {
		int Area = width * height;
		return Area;
	}
}

public class Q4 {
	public static void main (String args[]) {
		Rectangle obj = new Rectangle();
		System.out.println("Area Of Rectangle : "+obj.getArea(10, 10));
	}
}
