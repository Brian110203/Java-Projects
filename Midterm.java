//Brian Knapp
//Import scanner and set up class.
import java.util.Scanner;
public class Midterm {

	//Set up main loop, and assign double variables to "0".
	public static void main(String[] args) {
		double gpaGrad = 0;
		double gpaUndergrad = 0;
		double gradStudents = 0;
		double undergradStudents = 0;
		double gradAverage = 0;
		double undergradAverage = 0;
		
		//Set up an infinite loop that breaks when the user enters "quit"
		//Ask the user to enter the student type, assign it to the variable "studentType".
		//Using the "toLowerCase" method take "studentType" and convert it to all lowercase letters to give it case insensitivity.
		while(true) {
			System.out.print("\nPlease enter the student type: 'undergrad', 'grad', or 'quit' to exit. ");
			Scanner input = new Scanner(System.in);
		    String studentType = input.nextLine();
		    studentType = studentType.toLowerCase();
		    
		    //Using the ".equals" method check if the user inputed string is "grad".
		    //If it does add 1 to the variable "gradStudents".
		    //Ask the user for a gpa and calculate the new gpa by dividing the "gpaGrad" variable by the "gradStudents" variable and assign it to "gradAverage".
		    if (studentType.equals("grad")) {
		    	gradStudents = gradStudents + 1;
		    	System.out.print("\nPlease enter this Grad's GPA: ");
		    	double nextGradGpa = input.nextDouble();
		    	gpaGrad = gpaGrad + nextGradGpa;
		    	gradAverage = gpaGrad / gradStudents;
		    	System.out.print("\n");
		    	continue;
		    }
		    
		    //Use the same process as before to calculate the gpa average for undergrads.
		    if (studentType.equals("undergrad")) {
		    	undergradStudents = undergradStudents + 1;
		    	System.out.print("\nPlease enter this undergrad's GPA: ");
		    	double nextUndergradGpa = input.nextDouble();
		    	gpaUndergrad = gpaUndergrad + nextUndergradGpa;
		    	undergradAverage = gpaUndergrad / undergradStudents;
		    	System.out.print("\n");
		    	continue;
		    }
		    
		    //If the user enters "quit", print out the average for the grad and undergrad students and then break the loop.
			if (studentType.equals("quit")) { 
				System.out.printf("\nThe average GPA of all Grad students is: %.2f", gradAverage);
				System.out.printf("\nThe average GPA of all undergrad students is: %.2f", undergradAverage);
			    break;
			}
			
			//If the user doesn't enter 'undergrad', 'grad', or 'quit', print an error message and re-loop.
			else {
				System.out.print("\nInvalid student type, please enter 'undergrad' for undergrad, 'grad' for grad, or 'quit' to exit.\n");
				continue;
			}
		}
	}
}