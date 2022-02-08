//Brian Knapp
//Set up main loop and class.
import java.util.Scanner;
public class Discussion4 {
	
	public static void main(String[] args) {
		
		//Take user input and assign it to the variable "reverseString"
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a String: ");
	    String inputtedString = input.nextLine();
	    
	    //Create a string buffer of the user's input and assign it to the variable "reverseString".
	    //Reverse "reverseString" by using the ".reverse" method and output the result to the user.
	    //This is possible since string buffers, unlike regular strings, can be modified.
		StringBuffer reverseString = new StringBuffer(inputtedString);
	    System.out.println("Reversed String: " + reverseString.reverse());
	}
}
