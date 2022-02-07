//Brian Knapp
//Import java.lang and java.io.
import java.lang.*;
import java.io.*;

//Set up EvenNumberOnlyException class.
class EvenNumberOnlyException extends Exception {
	EvenNumberOnlyException(String num) {
		super(num); }
}

//Set up myException class and main loop.
public class myException {
	
	public static void main(String args[]) {
		
		//Ask user for a number and print out the number or exception to the user.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			
			System.out.println ("Please Enter a Number: ");
			n=Integer.parseInt(br.readLine());
			if(n%2==0) {
				
				System.out.println ("This  Number Is Even."); }
			else {
				
				//Throw exception.
				throw new EvenNumberOnlyException("This Number is Not Even."); }
		}
		
		//Catch exception.
		catch(EvenNumberOnlyException evenOnly) {
			System.out.println (evenOnly); }
		
		catch(IOException exception) {
			System.out.println (exception);}
		}
}