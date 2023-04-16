package InterviewQuestion;

import java.util.Scanner;

public class positiveOrNegative {

	Scanner sc = new Scanner(System.in);

	void number() {
		
		System.out.println("Enter the number  :");
		int inputNumber = sc.nextInt();

		if (inputNumber < 0) {
			System.out.println("The entered number is negative");

		} else {
			System.out.println("The entered number is posituve");
		}
		if (inputNumber == 0) {
			System.out.println("The entered number is 0");
		}

	}

}
