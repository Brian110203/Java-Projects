import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class InsertToFile
{   
    public static void main(String[] args) throws IOException {
      insertToFile();

}
public static String insertToFile() throws IOException{
  
  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("FileToEdit");
    String fileToEdit = myObj.nextLine();  // Read user inputt

    System.out.println("Enter course details");
    String course = myObj.nextLine();  // Read user inputt
    boolean validFile = course.equals("CourseList.txt");
    if (validFile == true) {

    Path path = Paths.get(fileToEdit);

    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

    //Couldn't figure out how to insert to a specific line.
    //This is the only solution I could get to work.
    int position = lines.size() / 2;
    String extraLine = course;  

    lines.add(position, extraLine);
    Files.write(path, lines, StandardCharsets.UTF_8);
    return course;
    }
    else {
    	System.out.println("Invalid File Name");
    }
	return course;
    
}
}
