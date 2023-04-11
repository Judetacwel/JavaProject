package PhoneSelection;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneList {

	Scanner sc = new Scanner(System.in);
	String phoneModelInput;
	String[] phoneModels = { "Samgsung", "Google", "Apple" };
	String[] samgsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	String[] apple = { "Iphone 12", "Iphone 12 mini", "Iphone 11", "Iphone 11 pro" };

	void phoneCategory() {

		System.out.println("Enter the Phone Brand You wish to see  ");
		phoneModelInput = sc.nextLine();

		for (int i = 0; i < phoneModels.length; i++) {
			if (phoneModels[i].equals(phoneModelInput)) {
				System.out.println("You have selected " + phoneModels[i] + '\n' + "These are the available phones for "
						+ phoneModels[i]);

				switch (phoneModelInput) {

				case "Samgsung":
					System.out.println(Arrays.toString(samgsung));
					sam();

					break;

				case "Google":
					System.out.println(Arrays.toString(google));
					google();


					break;
				case "Apple":
					System.out.println(Arrays.toString(apple));
					apple();

					break;
				default:
					System.out.println(" Enter correct input");

				}

			}
		}

	}

	void sam() {
		System.out.println("Select your phone :");
		String phoneInput = sc.nextLine();

		int j;

		for (j = 0; j < samgsung.length; j++) {

			if (phoneInput.equals(samgsung[j])) {
				System.out.println("You have selected : " + phoneInput);
				break;
			}

		}

		if (j >= samgsung.length) {
			System.out.println("please enter a valid name");
		}

	}

	void apple() {
		System.out.println("Select your phone :");
		String phoneInput = sc.nextLine();

		int j;

		for (j = 0; j < apple.length; j++) {
			if (phoneInput.equals(apple[j])) {
				System.out.println("You have selected : " + phoneInput);
				break;
			}

		}
		if (j >= apple.length) {
			System.out.println("Please enter a valid input");
		}

	}

	void google() {
		System.out.println("Select your phone :");
		String phoneInput = sc.nextLine();

		int j;

		for (j = 0; j < google.length; j++) {
			if (phoneInput.equals(google[j])) {
				System.out.println("You have selected : " + phoneInput);
				break;
			}

		}
		if (j >= google.length) {
			System.out.println("Please enter a valid input");
		}

	}

}
