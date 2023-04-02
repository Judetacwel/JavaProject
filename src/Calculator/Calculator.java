package Calculator;

import java.util.Scanner;

public class Calculator {

	Scanner sc = new Scanner(System.in);

	void addition() {
		int firstNumber;
		int secondNumber;
		System.out.println("Enter first number :");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number :");
		secondNumber = sc.nextInt();
		int sum = firstNumber + secondNumber;

		System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

	}

	void substraction() {
		int firstNumber;
		int secondNumber;
		System.out.println("Enter first number :");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number :");
		secondNumber = sc.nextInt();
		int sub = firstNumber - secondNumber;

		System.out.println(firstNumber + " - " + secondNumber + " = " + sub);

	}

	void multiplication() {

		int firstNumber;
		int secondNumber;
		System.out.println("Enter first number :");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number :");
		secondNumber = sc.nextInt();
		int mul = firstNumber * secondNumber;

		System.out.println(firstNumber + " * " + secondNumber + " = " + mul);

	}

	void division() {
		int firstNumber;
		int secondNumber;
		System.out.println("Enter first number :");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number :");
		secondNumber = sc.nextInt();
		int div = firstNumber / secondNumber;

		System.out.println(firstNumber + " / " + secondNumber + " = " + div);

	}

	void square() {
		int number;
		System.out.println("Enter the number :");
		number = sc.nextInt();
		int squ = number * number;

		System.out.println("Square of   " + number + " = " + squ);

	}

	void cube() {
		int number;
		System.out.println("Enter the number :");
		number = sc.nextInt();
		int cube = number * number * number;

		System.out.println("Cube of   " + number + " = " + cube);

	}
}
