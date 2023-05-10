package bankOperations;

public class PersonalAccountDetails {

	public int accountNumber;

	public String nameOfPerson;

	private double balance;

	private int pinNumber;

	private String onlineBankingPassword;

	public PersonalAccountDetails(int accountNumber, String nameOfPerson, double balance, int pinNumber,
			String onlineBankingPassword) {
		this.accountNumber = accountNumber;
		this.nameOfPerson = nameOfPerson;
		this.balance = balance;
		this.pinNumber = pinNumber;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public PersonalAccountDetails() {
		// TODO Auto-generated constructor stub
		
	}
	
	String getName() {
		
		return nameOfPerson;
	}
	

	double getBalance() {
		return balance;
	}

	int getPinNumber() {
		return pinNumber;
	}

	String getOnlinePassword() {
		return onlineBankingPassword;
	}

	int setPin(int pin) {

		this.pinNumber = pin;
		return pinNumber;

	}

	void setPassword(String Password) {

		this.onlineBankingPassword = Password;

	}
	
	void setBalance(double balance) {
		
		this.balance=balance;
	}

}
