//Brian Knapp
//Import scanner, set up main loop, and set up scanner object "subString".
import java.util.Scanner;
public class Discussion3 {
public static void main(String[] args) {
		 Scanner subString = new Scanner(System.in);
	        
		 //Ask the user for two strings and assign it to the variables "s1" and "s2"
	     System.out.print("Enter a String: ");
	     String s1 = subString.nextLine();
	        
	     System.out.print("Enter Another String: ");
	     String s2 = subString.nextLine();
	        
	     //Use "if/ else" and "indexOf" to determine if "s2" is a substring of "s1" by returning -1 if "s2" is not matched as a substring of "s1".
	     if (s2.indexOf(s1) == -1) {
	    	 System.out.print(s1 + " is not a substring of " + s2);
	     	}
	     else{
	    	 System.out.print(s1 + " is a substring of " + s2);
	     	}
	}

}
