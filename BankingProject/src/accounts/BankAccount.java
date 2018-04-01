package accounts;

import customer.Customer;

public class BankAccount {
	double balance;
	// customer this bank account belongs to
	Customer customer;
	// counts number of accounts made. shared across all instances
	static int counter = 10000;
	// instance var of account number
	int accountNumber;
	
	BankAccount(String name, int age) {
		balance = 0;
		customer = new Customer(name, age);
		counter += 1; // italicized means static var
		accountNumber = counter; // first account will have account number 10,001
	}
	
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount("x", 35);
		BankAccount a2 = new BankAccount("abc", 16);
		System.out.println("person " + a1.customer.getName() + " " + a1.accountNumber);
		System.out.println("person " + a2.customer.getName() + " " + a2.accountNumber);
	}
}
