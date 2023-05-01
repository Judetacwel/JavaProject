package bankOperations;

import java.util.Scanner;

public class BankOperations {

	Scanner sc = new Scanner(System.in);
	PersonalAccountDetails accountDetails = new PersonalAccountDetails();

	int accountBalance = accountDetails.getBalance();

	void withDraw() {
		System.out.println("Enter the amount to withdraw :");
		int withDrawAmount = sc.nextInt();
		if (accountBalance > withDrawAmount) {

			accountBalance -= withDrawAmount;
			System.out.println("you have withdrawed " + withDrawAmount);

		} else {
			System.out.println("Not enough bakance!!!");
		}

		System.out.println("Do you want to see your current balance : yes/no ?");
		String userInput = sc.next();
		if (userInput.equals("Yes")) {
			viewBalance();
		}

	}

	void deposit() {

		System.out.println("Enter the amount to be deposited :");
		int amountDepostied = sc.nextInt();
		accountBalance += amountDepostied;
		System.out.println("You have deposited " + amountDepostied);

		System.out.println("Do you want to see your current balance : yes/no ?");
		String userInput = sc.next();
		if (userInput.equals("Yes")) {
			viewBalance();
		}

	}

	void viewBalance() {

		System.out.println("your current balance is " + accountBalance);

	}

}
