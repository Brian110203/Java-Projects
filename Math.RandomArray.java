//Brian Knapp
//Set up class and main method.
public class Discussion6{
	public static void main(String[] args) {
		
		//Set up an array of ten integers in between 0 and 9.
		int[] numberArray = new int[10];

		//Generate and store the count of the hundred numbers generated between one and nine using "Math.random". 
		for (int i = 1; i <= 100; i++) {
			numberArray[(int)(Math.random() * 10)]++;
		}

		//Print out the results the the user.
		System.out.println("Output:");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println("Count for " + i + " is: " + numberArray[i]);
		}
	}
}
