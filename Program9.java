//Brian Knapp
//Import Scanner, import decimalFormat, set up class, and set up main loop.
import java.util.Scanner;
import java.text.DecimalFormat;
public class Program9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");

		//Ask the user for the 3 sides of the triangle
		boolean repeatSidesInput = true;
		do {
			// Prompt the user to enter three sides of the triangle
			System.out.print("\nEnter three side of the triangle, press the enter key after each side has been entered: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
	
			//Create the triangle with user input
			try {
				Triangle triangle = new Triangle(side1, side2, side3);
				repeatSidesInput = false;	
				System.out.println(triangle.toString());
				System.out.println("Area: " + df.format(triangle.calculateArea()));
				System.out.println("Perimeter: " + df.format(triangle.calculatePerimeter())); }
			
			catch (IllegalTriangleException exception) {
				System.out.println(exception.getMessage()); } 
			} 
			while (repeatSidesInput); }
}