///Import scanner so it can be used to get user input
import java.util.Scanner;
public class Week1Assignment {

	///Set up main loop, and scanner objects
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Scanner myName = new Scanner(System.in);
		
		///Ask user for their name and assign it to the variable "Name".
		System.out.println("Please Enter Your Name: ");
		String Name = myName.nextLine();
		
		///Ask the user for the sub total of their bill, assign the value to the variable "Purchaseamount", and assign the Gratuity rate.
		System.out.println(Name + ", Please Enter The Subtotal of Your Bill: $");
		double Purchaseamount = myObj.nextDouble();
		double Gratuity = 15.00;

		    //Calculate total Gratuity and total cost of the bill.
			Gratuity=(Gratuity/100.0);
			double TotalGratuity = Purchaseamount * Gratuity;
			double totalcost = Purchaseamount + TotalGratuity;

		    //Display the sub total, gratuity rate, and total for the bill.
		    System.out.println(Name + ", Your Subtotal is: $" + Purchaseamount);
		    System.out.println("15% Gratuity: $" + TotalGratuity);
		    System.out.print("Total: $" + totalcost);
		}
}