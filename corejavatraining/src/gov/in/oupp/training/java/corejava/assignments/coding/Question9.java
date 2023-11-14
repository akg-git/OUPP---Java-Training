/**
 * Create a class Bank with a method calculateInterest(). Create two subclasses, SavingsAccount and Loan, that inherit from 
 * Bank and provide their own implementation of the calculateInterest() method. 
 */
package gov.in.oupp.training.java.corejava.assignments.coding;

/**
 * @author AKG
 *
 */

class Bank {

	public void calculateInterest() {
		System.out.println("Bank peovides general Interest Rate");
	}
}

class SavingsAccount extends Bank {

	public void calculateInterest() {
		float interest = 3.4f;
		System.out.println("Savings Account has " + interest);
	}
}

class Loan extends Bank {

	public void calculateInterest() {
		float interest = 10.4f;
		System.out.println("Loan has " + interest);
	}
}

public class Question9 {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.calculateInterest();

		SavingsAccount savings = new SavingsAccount();
		savings.calculateInterest();

		Loan loan = new Loan();
		loan.calculateInterest();

	}

}
