package pizzabill;

import java.util.Scanner;

public class Pizzabill {

	int pizzaSizePrice;
	String[] pizzaSizeAvailable = { "small", "medium", "large" };
	String pizzaSizeNeeded;
	int additionalPepperoniPrice;
	int extraCheese;
	int totalPrice;
	Scanner sc = new Scanner(System.in);

	void totalPriceofPizza() {

		totalPrice = pizzaSizePrice + additionalPepperoniPrice + extraCheese;
		System.out.println("Your final bill is :  $" + totalPrice);
	}

	void pizzaSize() {

		System.out.println("select the size of pizza : ");
		pizzaSizeNeeded = sc.nextLine();

		for (int i = 0; i < pizzaSizeAvailable.length; i++) {
			if (pizzaSizeAvailable[i].equals(pizzaSizeNeeded)) {
				switch (pizzaSizeNeeded) {

				case "small":
					pizzaSizePrice = 15;
					break;
				case "medium":
					pizzaSizePrice = 20;
					break;
				case "large":
					pizzaSizePrice = 25;
					break;

				}
			}
		}
	}

	void additionalPepperoniTopping() {

		System.out.println("Would you like any Additional Pepperoni Topping ?? : yes/no");
		String toppingInput = sc.nextLine();
		if (toppingInput.equals("yes")) {

			switch (pizzaSizeNeeded) {

			case "small":
				additionalPepperoniPrice = 2;
				break;
			case "medium":
				additionalPepperoniPrice = 3;
				break;
			case "large":
				additionalPepperoniPrice = 3;
				break;

			}
		}
	}

	void extraCheese() {

		System.out.println("Do you like to add Extra cheese ? : yes/no ");
		String extraCheeseInput = sc.nextLine();
		if (extraCheeseInput.equals("yes")) {
			extraCheese = 1;
		}
	}
}
