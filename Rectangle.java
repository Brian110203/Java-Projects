//Jamie Patterson
//Rectangle Calculations

public class Rectangle {
	
	private static double width = 1.0;
	private static double length = 1.0;
	
	public Rectangle () {
	}
	
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	public static double getWidth() {
		return width;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	public static double getLength() {
		return length;
	}
	
	void setLength(double length) {
		this.length = length;
	}
	
	public static double getArea() {
		double area = length * width;
		return area;
	}
	
	public static double getPerimeter() {
		double perimeter = (length * 2) + (width * 2);
		return perimeter;
	}
	}
