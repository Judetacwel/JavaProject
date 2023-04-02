package ChocolateBox;

import java.util.Scanner;

public class chocolate {
	
	Scanner sc = new Scanner(System.in);

	void chocolateCount() {

		for (int chocolates = 27; chocolates <62;) {

			System.out.println("Do you want to add 5 chocolates : Yes/No ?");
			String input=sc.nextLine();
			if(input.equals("Yes")) {
				chocolates= chocolates+ 5;
				System.out.println("Number of chocolates in Box : "+chocolates);
			}
			else if(input.equals("No")) {
				System.out.println("OKay. Currently there are "+chocolates+" chocolates");
			}
				
		}

	}

}
