package Calculator;

import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String function;

		Calculator cal = new Calculator();

		System.out.println("Choose the operation you want to work" + '\n' + "1. For Addition type-ADD " + '\n'
				+ "2. For Substraction type- SUB" + '\n' + "3. For Multiplication type- MUL " + '\n'
				+ "4. For Division type- DIV" + '\n' + "5. For Square of number type- SQUARE" + '\n'
				+ "6. For Cube type- CUBE");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		function = sc.nextLine();
		switch (function) {

		case "ADD":
			cal.addition();
			break;
		case "SUB":
			cal.substraction();
			break;
		case "MUL":
			cal.multiplication();
			break;
		case "DIV":
			cal.division();
			break;
		case "SQUARE":
			cal.square();
			break;
		case "CUBE":
			cal.cube();
			break;
		default:
			System.out.println("Invalid Operation");

		}

	}

}
