//Brian Knapp
//Import scanner and set up class.
import java.util.Scanner;
public class Assignment6 {
	
	//Create method "loadWords" to set up the array for the possible answers.
	public static String[] listOfWords = loadWords()
			;
	public static String[] loadWords() {
		String[] listOfWords = { "variable", "coding", "java", "class", "method", "array", "string" };
		return listOfWords; }
	
	//Set up main method, and welcome the user.
	public static void main( String[] args ) {
		
		System.out.println( "\nWelcome, Try to Guess the Words by Guessing One letter at a Time");
		System.out.println( "\nHint: They Are Java Coding Themed.");
		
		//Set up variables.
		loadWords();
		String randomWord;
		char[] hiddenWord;
		Scanner input = new Scanner(System.in);
		String userGuess;
		int missed = 0;
		boolean foundLetter = false, solved = false;
		
		//Pick a random word from the array using Math.random.
		//Assign it to the variable "randomWord" and assign its length to "hiddenWord".
		randomWord = listOfWords[ (int)(Math.random() * listOfWords.length) ];
		hiddenWord = new char[randomWord.length()];
		
		//Change the letters in "hiddenWord" to asterisks.
		for ( int i = 0; i < randomWord.length(); i++ ) {
			hiddenWord[i] = '_'; }		
		
		//Set up while loop for when the word has not yet been solved.
		while (! solved) {
			
			System.out.println( "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
			System.out.print( "Word:\t" );
			
			for ( int i = 0; i < randomWord.length(); i++ ) {
				System.out.print( hiddenWord[i] + " " ); }
			
			System.out.print("\nMisses: ");
			System.out.print( missed );
			
			System.out.print( "\nGuess: " );
			userGuess = input.next();
			foundLetter = false;
			
			//Set up for loop to determine if the user guessed a letter.
			for ( int i = 0; i < randomWord.length(); i++ ) {
				if ( userGuess.charAt(0) == randomWord.charAt(i) ) {
					hiddenWord[i] = randomWord.charAt(i);
					foundLetter = true; }}
			
			//If no letter is found increase the misses by 1.
			if (!foundLetter) {
				missed = missed + 1;}
			
			//Determine how many letters havent been solved and use that value to determine whether the user guessed the word.
			int hiddenCount = 0;
			
			for ( int i = 0; i < randomWord.length(); i++ ) {
				if ( '_' == hiddenWord[i] )
					hiddenCount++;}
			
			if (hiddenCount > 0) 
				solved = false;
			
			else
				solved = true;}
		
		System.out.println( "======================================\n" );
		System.out.print( "Word:\t" );
		
		for ( int i = 0; i < randomWord.length(); i++ ) {
			System.out.print( hiddenWord[i] + " " );}
		
		System.out.print("\nMisses: ");
		System.out.print( missed );
	
		//Display to the user the word if they won.
		if (solved)
			System.out.println( "\nThe word is: " + randomWord);
		else
			System.out.println( "\n\nThe word was: " + randomWord );}}