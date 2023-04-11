package WaterTank;

import java.util.Scanner;

public class WaterTnk {

	void tackFill() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int tankCapacity = 0; tankCapacity < 100;) {

			System.out.println("Do you want to add one bucked of water : yes/no  ???");
			String input = sc.nextLine();

			if (input.equals("yes")) {
				tankCapacity += 10;
				System.out.println("water stored is : " + tankCapacity + " Liters");

			} else

			if (tankCapacity < 100) {
				System.out.println("Tank filled");
			}
		}
	}

}
