import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Please Enter Employee Name:");
		Scanner myObj = new Scanner(System.in);
		String name = myObj.nextLine();
		Employee.name = name;
		
		System.out.println("Please Enter Their Department:");
		String department = myObj.nextLine().toLowerCase();
		
		System.out.println("Please Enter Their Position:");
		String position = myObj.nextLine();
		Employee.position = position;
		
		System.out.println("Please Enter Their Salary: $");
		int salary = myObj.nextInt();
		Employee.salary = salary;
		
		System.out.println("Please Enter Number of Years Employed:");
		int yearsEmployed = myObj.nextInt();
		Employee.yearsEmployed = yearsEmployed;
		
		System.out.println("Employee Name: " + Employee.name);
		System.out.println("Employee Department: " + department);
		System.out.println("Employee Position: " + Employee.position);
		System.out.println("Employee Years Employed: " + Employee.yearsEmployed);
		System.out.println("Employee Salary: $" + Employee.salary);
		
		if (department.equals("tech department")) {
			while (Employee.yearsEmployed > 5) {
				int newSalary = (int) (Employee.salary * 0.05 + Employee.salary);
				Employee.salary = newSalary;
				System.out.println("\nNew Employee Salary After Raise: $" + Employee.salary);
				break;
			}
		}
	}

}
