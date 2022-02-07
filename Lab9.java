//Jamie Patterson
//Program to test Rectangle class

public class Lab9 {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		
		double rec1Width = rec1.getWidth();
		double rec1Length = rec1.getLength();
		double rec1Area = rec1.getArea();
		double rec1Perimeter = rec1.getPerimeter();
		
		System.out.println("Rectangle 1 Width, Length, Area, and Perimeter: Width = " + String.format("%.2f",rec1Width) + ", " + String.format("%.2f",rec1Length) + ", " + String.format("%.2f",rec1Area) + ", " + String.format("%.2f",rec1Perimeter));

		
		Rectangle rec2 = new Rectangle(3, 35.9);
		
		double rec2Width = rec2.getWidth();
		double rec2Length = rec2.getLength();
		double rec2Area = rec2.getArea();
		double rec2Perimeter = rec2.getPerimeter();		
		
		System.out.println("Rectangle 2 Width, Length, Area, and Perimeter: Width = " + String.format("%.2f",rec2Width) + ", " + String.format("%.2f",rec2Length) + ", " + String.format("%.2f",rec2Area) + ", " + String.format("%.2f",rec2Perimeter));
	}

}
