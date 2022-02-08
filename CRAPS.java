//Brian Knapp
//Import scanner, set up class, and main loop.
import java.util.Random;
public class Assignment4 {
	public static void main(String[] args) {

			//Print out welcome message and perform initial dice roll.
		    System.out.println("Welcome to the game of craps!");
		    int rollNumber = diceRoll();

		    //Check whether the initial roll is a 7 or 11, if so inform the user that they won.
		    if (rollNumber == 7 || rollNumber == 11) {
		      System.out.println("\n That's a: " + rollNumber);
		      System.out.println("\n Congratulations, You Win!");
		      
		    //If the initial roll didn't return a 7 or 11 check whether the initial roll is a 2, 3, or 12.
		    //If so inform the user that they lost.
		    } else if (rollNumber == 2 || rollNumber == 3 || rollNumber == 12) {
		      System.out.println("\n That's a: " + rollNumber);
		      System.out.println("\n Sorry, You Crapped Out, You Lose!");
		      
		    //If the initial roll didn't fulfill the initial win or loss conditions assign the initial roll to the variable "point" and set up a while loop.
		    } else {
		      int point = rollNumber;
		      while (true) {
		    	  System.out.println(" Your Point is: " + point);
		    	  rollNumber = diceRoll();
		    	  System.out.println("\n That's a: " + rollNumber);
		    	  
		    	//If the new dice roll is equal to the variable "point" inform the user that they won and break the loop.
		        if (rollNumber == point) {
		          System.out.println("\n Congratulations, You Win!");
		          break;
		        }
		        
		        //If the new dice roll is equal to t7 inform the user that they lost and break the loop.
		        if (rollNumber == 7) {
		          System.out.println("\n Sorry, You Crapped Out, You Lose!");
		          break;
		        }
		      }
		    }
		  }
		
		//Use "public static int" and "randomGenerator" to assign dice1 and dice 2 a random number between 1 and 6
		public static int diceRoll() {
			
			Random randomGenerator = new Random ();
			int dice1 = randomGenerator.nextInt (6) + 1;
			int dice2 = randomGenerator.nextInt (6) + 1;
			
			//Inform the user what they rolled.
			System.out.println ("\n You rolled a " + dice1 + " and a " + dice2);
			
			//Calculate the sum of the dice.
			int diceRoll = dice1 + dice2;
			  return diceRoll;
			}
		}
