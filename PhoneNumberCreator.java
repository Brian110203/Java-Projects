//Brian Knapp
//Import Scanner object and set up class.
import java.util.Scanner;
public class Assignment5 {
private static Scanner input;
    
    //Using a boolean method determine if the user entered number does NOT equal 11.
    //If it doesn't, return false, otherwise true.
    public static boolean isValidPhoneNumber(String phoneNumber) {
    	if (phoneNumber.length() != 11) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
    //Set up long method "getNumber".
    public static long getNumber(String userNumber) {
        long number = 0;
        int numberLen = userNumber.length();

        //Set up for loop.
        for (int currCharacter = 0; currCharacter < numberLen; currCharacter++) {
            char charToCheck = userNumber.charAt(currCharacter);

            //Check each user entered character and determine if it's a letter.
            //If it is, translate it to its int counterpart.
            //This is done through the use of a switch statement.
            if (Character.isLetter(charToCheck))  {
                switch(charToCheck)
                {
                case 'A' : case 'B' : case 'C' : number *= 10; number += 2; break;
                case 'D' : case 'E' : case 'F' : number *= 10; number += 3; break;
                case 'G' : case 'H' : case 'I' : number *= 10; number += 4; break;
                case 'J' : case 'K' : case 'L' : number *= 10; number += 5; break;
                case 'M' : case 'N' : case 'O' : number *= 10; number += 6; break;
                case 'P' : case 'Q' : case 'R' : case 'S' : number *= 10; number += 7; break;
                case 'T' : case 'U' : case 'V' : number *= 10; number += 8; break;
                case 'W' : case 'X' : case 'Y' : case 'Z' : number *= 10; number += 9; break;
                }
            }
            
            //If the user inputed character is a number, translate it to a int.
            else if (Character.isDigit(charToCheck)) {
                number *= 10; number += Character.getNumericValue(charToCheck);
            }
            
            //If the character is not a letter or number, break the loop.
            else {
                break;
            }

        }
        return number;

    }    
    
    //Use a string method to translate and output the result to the user.
    public static String translateNumber(String userNumber) {
    	//Check if the number is the correct length, us the isValidPhoneNumber method to determine this.
    	//Change the letters to uppercase.
    	//Use the getNumber method to translate the numbers to letters and assign it to the variable "finalNumber".
    	if (isValidPhoneNumber(userNumber) == true) {
    		userNumber = userNumber.toUpperCase();
    		long finalNumber = getNumber(userNumber);

    		//Print out the result to the user.
    		System.out.printf("%s is translated to %s",
    		userNumber, finalNumber);
    	}
    	
    	//If the number isn't valid print out an error.
    	else {
    		System.out.printf("Please enter a valid phone number");
    	}
    	return userNumber;
}
    
    //Set up main loop and get user input.
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Please enter a phone number string: ");
        String userNumber = input.nextLine();
        translateNumber(userNumber);
    }
}
