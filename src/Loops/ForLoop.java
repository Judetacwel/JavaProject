package Loops;

import java.util.Scanner;

public class ForLoop {

	int actualPIN = 1234;
	int enteredPIN;
	int withdrawAmount;
	int accountBalance = 5000;

	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {
		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter the PIN");
			enteredPIN = sc.nextInt();
			if (actualPIN == enteredPIN) {
				System.out.println("Entered PIN is correct");
				System.out.println("Enter the amount to be withdrawn:");
				withdrawAmount = sc.nextInt();
				if (accountBalance >= withdrawAmount) {

					System.out.println("Cash withdrawn in amount of: " + withdrawAmount);
				} else {
					System.out.println("You don't have enough balance ");
				}

			} else {
				System.out.println("Entered PIN is incorrect");
			}
		}System.out.println("Your Card is Blocked. Please Go to the Bank for more info");
	}
}
