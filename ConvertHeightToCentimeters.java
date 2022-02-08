///Import scanner so it can be used to get user input
import java.util.Scanner;
public class Week1Discussion {

///Set up main loop, and scanner objects
public static void main(String[] args) {
Scanner myFeet = new Scanner(System.in);
Scanner myInches = new Scanner(System.in);

///Ask user for their Height and assign it to the variables "feet" and "inches".
System.out.println("How Many Feet Tall are You?: ");
double feet = myFeet.nextDouble();
System.out.println("How About Inches?: ");
double inches = myInches.nextDouble();

///Echo back to the user their height
System.out.println("Thank You, You Entered, " + feet + " Foot, " + inches + " Inches");

///Convert their height in feet to inches, and calculate it in centimeters.
double feetToInches = feet * 12;
double totalHeight = feetToInches + inches;
double heightinCentimeters = totalHeight * 2.54;

///Output the users height in centimeters
System.out.println("Your are, " + heightinCentimeters + " Centimeters Tall!");

}
}
