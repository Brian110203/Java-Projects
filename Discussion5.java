//Brian Knapp
//Import Scanner and set up class.
import java.util.Scanner;
public class Discussion5 {
	
	//Set up main loop, prompt the user for a string, and execute the "countLetters" method.
	public static void main(String[] args) {
		System.out.print("Please Enter a String: ");
		countLetters();
	}
	
	//Set up "countletters" method.
	//Take the user's string and use the "Character.isLetter" function to determine how many letters the string contains.
	//Output the result to the user.
	static void countLetters() {
		Scanner input = new Scanner(System.in);
	    String userString = input.nextLine();
		
	    int letterCount = 0;
	    for (int i = 0; i < userString.length(); i++) {
	       if (Character.isLetter(userString.charAt(i))) letterCount++;
	      }
	      System.out.println("\nYour String Contains " + letterCount + " Letters.");
	}
}