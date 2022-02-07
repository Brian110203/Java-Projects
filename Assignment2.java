//Brian Knapp
//Import Scanner object and assign class.
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		
		//Display rules to the player.
		System.out.println("Please Enter 1(Rock), 2(Paper), 3(Scissors). ");
		System.out.println("Ties Count as Losses. ");
		
		
		//Generate random number and assign it to the variable "rps".
		int min = 1;
	    int max = 3;
	    int rps = (int)Math.floor(Math.random()*(max-min+1)+min);
		Scanner myObj = new Scanner(System.in);
		
		
		//Take the result from the random number generation and give the variable "computer" a value of "Scissors, Rock, or Paper".
		String computer = null;
		if (rps == 1) {
			computer = "Scissors";
		}
		if (rps == 2) {
			computer = "Rock";
		}
		if (rps == 3) {
			computer = "Paper";
		}
		
		
		//Take the result from the user input and give the variable "player" a value of "Rock, Paper, or Scissors".
		//The user input data is gathered using an int scanner object and is assigned to the variable "input1".
		int input1 = myObj.nextInt();
		String player = null;
		if (input1 == 1) {
			player = "Rock";
		}
		if (input1 == 2) {
			player = "Paper";
		}
		if (input1 == 3) {
			player = "Scissors";
		}
		
		
		//Determine whether the user or the computer won, and display it to the user.
		//If the user picks the same number as the computer, they win. Else they lose.
		if (input1 == rps) {
			System.out.println("You win! You chose "+ player +", The computer chose "+ computer + "!");
		}
		if (input1 != rps) {
			System.out.println("You lose. You chose "+ player +", The computer chose "+ computer + "!");
		}
		}
}