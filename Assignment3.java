//Brian Knapp
//Import scanner and set up class
import java.util.Scanner;
public class Assignment3 {
	
	//Set up main loop, gather user input, and assign it to variable "text".
	//Print out the converted words by using the string "wordToPigLatin", found later in the code, on the user inputed word(s).
	public static void main(String[] args) {
		System.out.println("Please Type a Word or a Sentence and Press Enter: ");
		Scanner PL = new Scanner(System.in);
		String text = PL.nextLine();
		System.out.println("Your Pig Latin Word(s): " + Assignment3.wordToPigLatin(text));
	}
	
	//Determine whether the word inputed by the the user starts with a vowel.
	//It utilizes the "private static boolean method" to return a value of true if it starts with a vowel, or false if not.
	private static boolean FCharVowel(char firstcharacter) {
		boolean isvowel = false;
		String vowels = "aeiou";
		for(int i = 0; i < vowels.length(); i++) {
			char character = vowels.charAt(i);
			if(character == firstcharacter) {
				isvowel = true;
				break;
			}
		}
				
		return isvowel;
	}
	
	//This code utilizes the private static string method to determine if the user inputed word(s) start with consonants and is so it returns what they are.
	//When it detects a vowel it breaks the loop and returns the consonants.
	//Using a for loop it starts at the first character, if its a consonant it appends it to the string "consonants" and repeats the loop for the next character.
	private static String getConsonants(String words) {
		String consonants = "";
		for(int i = 0; i < words.length(); i++) {
			char currentChar = words.charAt(i);
			if(Assignment3.FCharVowel(currentChar)) {
				break;
			}
			else {
				consonants += currentChar;
			}
		}
		return consonants;
	}
	
	//It uses the same method as before and appends "ay" at the end of the word if "isvowel" is true.
	//If "isvowel" is false if moves the prefix to the end of the word and appends "ay".
	private static String wordToPigLatin(String words) {
		String latin = "";
		boolean isvowel  = Assignment3.FCharVowel(words.charAt(0));
		if(isvowel) {
			latin += words + "ay";
		}
		else {
			String consonants = Assignment3.getConsonants(words);
			latin += words.substring(words.indexOf(consonants) +  consonants.length()) + consonants + "ay";
		}
		return latin;
	}
	
}