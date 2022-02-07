//Brian Knapp
import java.util.*;
import java.io.*;

//Set up StudentMain class.
public class TestStudentGrade{
	
	//Get user input for assignment, test, and participation grades.
    public static StudentGrade getStudentGrade(){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter score for assignment 1:");
        int assign1=sc.nextInt();
        if (assign1 > 100) {
        	 System.out.println("Invalid number, assignment 1 has been assigned the closest viable value 100");
        	 assign1 = 100;
        }
        if (assign1 < 0) {
       	 System.out.println("Invalid number, assignment 1 has been assigned the closest viable value 0");
       	 assign1 = 0;
       }
        
        System.out.println("Enter score for assignment 2:");
        int assign2=sc.nextInt();
        if (assign2 > 100) {
       	 System.out.println("Invalid number, assignment 2 has been assigned the closest viable value 100");
       	 assign2 = 100;
       }
       if (assign2 < 0) {
      	 System.out.println("Invalid number, assignment 2 has been assigned the closest viable value 0");
      	 assign2 = 0;
      }
       
        System.out.println("Enter score for assignment 3:");
        int assign3=sc.nextInt();
        if (assign3 > 100) {
       	 System.out.println("Invalid number, assignment 3 has been assigned the closest viable value 100");
       	 assign3 = 100;
       }
       if (assign3 < 0) {
      	 System.out.println("Invalid number, assignment 3 has been assigned the closest viable value 0");
      	 assign3 = 0;
      }
       
       
       System.out.println("Enter score for test 1:");
       int Test1=sc.nextInt();
       if (Test1 > 100) {
       	 System.out.println("Invalid number, test 1 has been assigned the closest viable value 100");
       	Test1 = 100;
       }
       if (Test1 < 0) {
      	 System.out.println("Invalid number, test 1 has been assigned the closest viable value 0");
      	Test1 = 0;
      }
       
       System.out.println("Enter score for test 2:");
       int Test2=sc.nextInt();
       if (Test2 > 100) {
      	 System.out.println("Invalid number, test 2 has been assigned the closest viable value 100");
      	Test2 = 100;
      }
      if (Test2 < 0) {
     	 System.out.println("Invalid number, test 2 has been assigned the closest viable value 0");
     	Test2 = 0;
     }
      
      
      System.out.println("Enter score for participation:");
      int participation=sc.nextInt();
      if (participation > 100) {
     	 System.out.println("Invalid number, test 2 has been assigned the closest viable value 100");
     	participation = 100;
     }
     if (participation < 0) {
    	 System.out.println("Invalid number, test 2 has been assigned the closest viable value 0");
    	 participation = 0;
    }

        //Get grades for assignments, tests, and participation by multiplying the inputed value by 0.2, or 0.4.
        int assignSum = assign1 + assign2 + assign3;
        int assignAverage = (int) (assignSum / 3);
        
        int assignGrade = (int) (assignAverage * 0.4);
        System.out.println("\nAssignment Score: " + assignAverage + "%");
        int testGrade = (int) (Test1 * 0.2);
        System.out.println("Test 1 Score: " + Test1 + "%");
        int testGrade2 = (int) (Test2 * 0.2);
        System.out.println("Test 2 Score: " + Test2 + "%");
        int participationGrade = (int) (participation * 0.2);
        System.out.println("Participation Score: " + participation + "%");
        
        //Get the final grade percentage by adding the scores for assignments, tests, and participation.
        int finalGrade = assignGrade + testGrade + testGrade2 + participationGrade;
        System.out.println("\nFinal Grade: " + finalGrade + "%");
        
        //Assign a letter grade based on the finalGrade Variable
        String letterGrade = " ";
        boolean valid = false;
        boolean valid2 = false;
        boolean valid3 = false;
        boolean valid4 = false;
        
        if (finalGrade < 60) {
        	letterGrade = "F";
        }
        if (finalGrade >= 60) {
        	valid = true;
        }
        if (valid == true) {
        	if (finalGrade < 70)
        		letterGrade = "D";
        }
        if (finalGrade >= 70) {
        	valid2 = true;
        }
        if (valid2 == true) {
        	if (finalGrade < 80)
        		letterGrade = "C";
        }
        if (finalGrade >= 80) {
        	valid3 = true;
        }
        if (valid3 == true) {
        	if (finalGrade < 90)
        		letterGrade = "B";
        }
        if (finalGrade >= 90) {
        	valid4 = true;
        }
        if (valid4 == true) {
        	if (finalGrade <= 100)
        		letterGrade = "A";
        }
        
        System.out.println("Letter Grade: " + letterGrade);

        
        StudentGrade s = new StudentGrade(assign1, assign2, assign3, Test1, Test2, participation);
        return s;

    }
    public static void main (String[] args) {
        getStudentGrade();
    }
}