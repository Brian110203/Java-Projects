public class Employee{
    
    static String name;
    static String department;
    static String position;
    static int salary;
    static int yearsEmployed;
    
    public Employee(){        
    }
    
    public Employee(String position, String name, String department){
        Employee.position = position;
        Employee.name = name;
        Employee.department = department;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        Employee.name = name;
    }
 
    public void setDepartment(String department) {
        Employee.department = department;
    }
    public String getDepartment() {
        return department;
    }
 
    public void setPosition(String position) {
        Employee.position = position;
    }
    public String getPosition() {
        return position;
    }
 
    public void setSalary(int salary) {
        Employee.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    
    public void setyearsEmployed(int yearsEmployed) {
        Employee.yearsEmployed = yearsEmployed;
    }
    public int getyearsEmployed() {
        return yearsEmployed;
    }
}