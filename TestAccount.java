//Brian Knapp
//Import Scanner
import java.util.Scanner;

//Set up the Test account class that sets up an array of 10 id's.
public class TestAccount {
	private static final Scanner in = new Scanner(System.in);

	//Set up main and array.
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 1; i < 11; i++) {
            accounts[i - 1] = new Account(i, 100.0); }

        System.out.print("Enter an id (1 - 10): \n");
        int id = in.nextInt();
        
        if (id < 1 || id > 10) {
            id = incorrectId(id); }

        //Ask the user what id they would like to modify.
        while (true) {
        	displayMenu();
            System.out.print("\nEnter a choice: \n");
            int choice = in.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an id (1 - 10): \n");
                id = in.nextInt();

                if (id < 1 || id > 10) {
                    id = incorrectId(id); }}
            performChoice(id, choice, accounts); }}

    //Check wheter the id entered is within the array.
    public static int incorrectId(int id) {
        //Scanner in = new Scanner(System.in);
        while (id < 1 || id > 10) {
            System.out.print("Please enter a valid id: ");
            id = in.nextInt();
            System.out.println(); }
        return id; }

    //Use a switch to gather the users input and modify the id.
    public static void performChoice(int id, int choice, Account[] accounts) {
        switch (choice) {
            case 1: 
                System.out.printf("\nThe balance of id " + id + " is $%.1f%n\n", accounts[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: \n");
                accounts[id - 1].withdraw(in.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: \n");
                accounts[id - 1].deposit(in.nextDouble());
                break;
            default:
                break; }}

    //Display the options for an id to the user.
    public static void displayMenu() {
        System.out.println("1: check balance, 2: withdraw, 3: deposit, 4: exit."); }}

//Set up the Account class.
//Set up id, balance, anualIntrestRate, and dateCreated.
class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    public Account() {
        dateCreated = new java.util.Date(); }
	
    //Create a constructor to set up the initial values of the account.
    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = 100; }

    //Create setter and getter methods for id, balance and annualInterestRate.
    public int getId() {
        return this.id; }

    public double getBalance() {
        return this.balance; }

    public double getAnnualInterestRate() {
        return annualInterestRate; }

    public void setId(int id) {
        this.id = id; }

    public void setBalance(double balance) {
        this.balance = balance; }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate; }
    
    //Getter method for datCreated.
    public String getDateCreated() {
        return this.dateCreated.toString(); }

    //Create a method named getMonthlyInterestRate that returns the monthly interest rate.
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ; }

    //Create a method named getMonthlyInterest that returns the monthly interest on the account.
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate(); }

    //Create a withdraw method that deposits the specified amount into the account.
    public void withdraw(double amount) {
        this.balance -= amount; }

  //Create a deposit method that deposits the specified amount into the account.
    public void deposit(double amount) {
        this.balance += amount; } }