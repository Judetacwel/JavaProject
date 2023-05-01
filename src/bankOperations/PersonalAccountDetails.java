package bankOperations;

public class PersonalAccountDetails {

	public int accountNumber;

	public String nameOfPerson;

	private int balance = 1000;

	private int pinNumber = 1234;

	private String onlineBankingPassword = "Password@123";

	int getBalance() {
		return balance;
	}

	int getPinNumber() {
		return pinNumber;
	}

	String getOnlinePassword() {
		return onlineBankingPassword;
	}

}
