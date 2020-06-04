import java.util.Scanner;

class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//Constructor
	BankAccount (String customerName, String customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
	}
	
	// Method to deposit money
	void deposit (int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	//Method to withdraw money
	void withdraw (int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	//Method will display previous transaction
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn: " + previousTransaction);
		}
		else {
			System.out.println("No Transaction Occured");
		}
	}
	
	//Method will Display menu in a while loop an take input from user
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is: " + customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		//While option is not E (Exit) run through the menu options
		do {
			System.out.println("======================================================================");
			System.out.println("Enter an option");
			System.out.println("======================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			
			// Use Switch Statement to select one of many code blocks to be executed .
			switch(option) {
			
			case 'A': 
				System.out.println("----------------------------------------------");
				System.out.println("Balance: " + balance);
				System.out.println("----------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B': 
				System.out.println("----------------------------------------------");
				System.out.println("Enter an amount to deposit:" );
				System.out.println("----------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C': 
				System.out.println("----------------------------------------------");
				System.out.println("Enter an amount to withdraw:" );
				System.out.println("----------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D': 
				System.out.println("----------------------------------------------");
				getPreviousTransaction();
				System.out.println("----------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("***************************************************");
				System.out.println("Thank you for using our banking application");
				break;
				
			// If there is no case match, try again
			default: 
				System.out.println("Invalid Option! Please try again");
				break;
			}
		}while(option != 'E');
	}

}
