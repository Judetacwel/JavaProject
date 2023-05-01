package bankOperations;

import java.util.Scanner;

public class MainBankingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int typeOfBanking;

		PersonalAccountDetails accDetails = new PersonalAccountDetails();
		ATM atm = new ATM();
		OnlineBanking online = new OnlineBanking();

		Scanner sc = new Scanner(System.in);

		System.out
				.println("What type of banking you want   :" + '\n' + "Press 1.ATM" + '\n' + "Press 2.Online Banking");
		typeOfBanking = sc.nextInt();

		if (typeOfBanking == 1) {

			System.out.println("Please Enter Your PIN Number");
			int enteredPin = sc.nextInt();
			if (enteredPin == accDetails.getPinNumber()) {

				atm.chooseOPeration();

			}else {
				System.out.println("Wrong PIN !!!");
			}

		} else if (typeOfBanking == 2) {

			System.out.println("Please Enter Your Online Banking Password :");

			String enteredPassword = sc.next();

			if (enteredPassword.equals(accDetails.getOnlinePassword())) {

				online.chooseOPeration();

			}else {
				System.out.println("Wrong Password !!!");
			}

		} else {
			System.out.println("Wrong input!!!");
		}
	}

}
