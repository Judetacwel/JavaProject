package Login;

import java.util.Scanner;

public class Login {

	Scanner sc = new Scanner(System.in);

	void credentialsCheck() {

		String userId = "pivotAdmin";
		String password = "Admin123";
		int i;

		for (i = 1; i <=3; i++) {

			System.out.println("Enter the UserId :");
			String id = sc.nextLine();

			System.out.println("Enter the password :");
			String pass = sc.nextLine();

			if (userId.equals(id) && password.equals(pass)) {
				System.out.println("You are logged in to the application");
				break;
			} else {
				if (i > 2) {
					System.out.println("Account Locked");
					break;	
				}
				System.out.println("Incorrect User id or password.Try again");
			}

		}

	}

}
