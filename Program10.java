//Brian Knapp
//Import scanner, set up class, and set up main loop.
import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		
		//Ask the user for two integers.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first integer: ");
		int int1 = Integer.parseInt(input.next());
		System.out.print("Enter your second integer: ");
		int int2 = Integer.parseInt(input.next());

		//Find the GCD.
		System.out.println("The greatest common divisor of " + int1 + " and " + int2 
			+ " is " + gcd(int1, int2)); }

	//Recursive method to find the greatest common divisor.
	private static int gcd(int int1, int int2) {
		if (int1 % int2 == 0)
			return int2;
		else
			return gcd(int2, int1 % int2); }
}