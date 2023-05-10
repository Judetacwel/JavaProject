package bankOperations;

import java.util.Scanner;

public abstract class BankOperations {

	Scanner sc = new Scanner(System.in);

	void withDraw(PersonalAccountDetails account) {
		 account.getBalance();
	}

	void deposit(PersonalAccountDetails account) {
		account.getBalance();
	}

	void viewBalance(PersonalAccountDetails account) {

		System.out.println(account.getBalance()); 
	}

	public abstract void changePinPassword(PersonalAccountDetails account);

	public void addNames() {

	}

	public String selectUser(PersonalAccountDetails[] nameList) {
		int i;
		System.out.println("Enter your Name : ");
		String enteredUserName = sc.next();

		String selectedUserName = null;

		for ( i = 0; i < nameList.length; i++) {
			if (nameList[i].getName().equals(enteredUserName)) {

				selectedUserName = nameList[i].getName();
				break;
			}

		}
		return selectedUserName;

	}

	
}
