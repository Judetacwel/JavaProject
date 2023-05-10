package bankOperations;

import java.util.Scanner;

public class MainBankingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int typeOfBanking;

		Scanner sc = new Scanner(System.in);

		PersonalAccountDetails jude = new PersonalAccountDetails(123456, "Jude Tacwel", 1000, 1111, "Password@123");
		PersonalAccountDetails anil = new PersonalAccountDetails(123457, "Anil Jose", 2000, 2222, "Aniljose123");
		PersonalAccountDetails manu = new PersonalAccountDetails(123458, "Manu Manu", 3000, 3333, "ManuManu123");
		PersonalAccountDetails jose = new PersonalAccountDetails(123459, "Jose Jose", 4000, 4444, "JoseJose123");
		PersonalAccountDetails gino = new PersonalAccountDetails(123460, "Gino Jose", 5000, 5555, "GinoJose@123");

		PersonalAccountDetails[] nameArray = { jude, anil, manu, jose, gino };
		/*		System.out.println("Enter your Name : 1.Jude 2.Anil 3.Manu 4.Jose 5.Gino ");
		int enteredUserName = sc.nextInt();


		for (int i = 1; i < nameArray.length; i++) {
			if (nameArray[i].equals(enteredUserName)) {

				selectedUserName = nameArray[i];
			}
		}
*/
		PersonalAccountDetails selectedUserName = jose;

		BankOperations bank = null;

		System.out
				.println("What type of banking you want   :" + '\n' + "Press 1.ATM" + '\n' + "Press 2.Online Banking");
		typeOfBanking = sc.nextInt();

		switch (typeOfBanking) {
		case 1:
			bank = new ATM();

			System.out.println("Please Enter Your PIN Number");
			int enteredPin = sc.nextInt();
			if (enteredPin == selectedUserName.getPinNumber()) {

				System.out.println("What operation you like to do : deposit / withdraw / balance/ changePin");
				String choosedOperation = sc.next();

				switch (choosedOperation) {
				case "deposit":
					bank.deposit(selectedUserName);
					break;
				case "withdraw":
					bank.withDraw(selectedUserName);
					break;
				case "balance":
					bank.viewBalance(selectedUserName);
					break;
				case "changePin":
					bank.changePinPassword(selectedUserName);
					break;

				default:
					System.out.println("Sorry Wrong input....");
				}

			} else {
				System.out.println("Wrong PIN !!!");
			}

			break;
		case 2:
			bank = new OnlineBanking();

			System.out.println("Please Enter Your Online Banking Password :");

			String enteredPassword = sc.next();

			if (enteredPassword.equals(selectedUserName.getOnlinePassword())) {

				System.out.println("What operation you like to do : deposit / withdraw / balance/ changePin");
				String choosedOperation = sc.next();

				switch (choosedOperation) {
				case "deposit":
					bank.deposit(selectedUserName);
					break;
				case "withdraw":
					bank.withDraw(selectedUserName);
					break;
				case "balance":
					bank.viewBalance(selectedUserName);
					break;
				case "changePin":
					bank.changePinPassword(selectedUserName);
					break;

				default:
					System.out.println("Sorry Wrong input....");
				}
			} else {
				System.out.println("Wrong Password !!!");
			}

			break;
		default:
			System.out.println("Wrong input!!!");
		}

	}

}
