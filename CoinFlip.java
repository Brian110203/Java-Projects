///Import scanner so it can be used to get user input
import java.util.Scanner;
public class Discussion2 {
///Set up main loop, and Min and Max Value
public static void main(String[] args) {
int min = 1;
int max = 2;    
//Generate random int value from 1 to 2
int coin = (int)Math.floor(Math.random()*(max-min+1)+min);
//Get User Input
Scanner myObj = new Scanner(System.in);
System.out.println("Please Enter 1(Heads), 2(Tails): ");
int input1 = myObj.nextInt();		
//Use "if" Statements to Print Out Whether the Player Chose Correctly
System.out.println("The Computer Chose: " + coin);
if (coin == input1) {
System.out.println("Congratulations! You Chose Correctly!"); 
}
if (coin != input1) {
System.out.println("Sorry, You Chose Incorrectly."); 
}
	     
}
}
