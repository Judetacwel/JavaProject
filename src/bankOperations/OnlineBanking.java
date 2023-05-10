package bankOperations;

public class OnlineBanking extends BankOperations {


	@Override
	void withDraw(PersonalAccountDetails account) {
		System.out.println("Enter the amount to withdraw :");
		double withDrawAmount = sc.nextInt();
		double balance = account.getBalance();

		if (balance > withDrawAmount) {

			balance -= withDrawAmount;
			System.out.println("you have withdrawed " + withDrawAmount+" balance :"+balance);

		} else {
			System.out.println("Not enough balance!!!");
		}
		account.setBalance(balance);

	}

	@Override
	void deposit(PersonalAccountDetails account) {

		System.out.println("Enter the amount to be deposited :");
		int amountDepostied = sc.nextInt();
		double balance = account.getBalance();

		balance += amountDepostied;
		System.out.println("You have deposited " + amountDepostied+" balance :"+balance);
		
		account.setBalance(balance+=amountDepostied);

		
	}

	@Override
	public void changePinPassword(PersonalAccountDetails account) {

		System.out.println("Enter the old password :");
		String oldPassword = sc.next();
		String password = account.getOnlinePassword();
		if (oldPassword.equals(password)) {

			System.out.println("Enter the new Password ");
			String newPasswords = sc.next();
			if (newPasswords.length() < 8 || newPasswords.contains("@") || newPasswords.contains("&")
					|| newPasswords.contains("$")) {
				System.out.println("Invalid Password!!!");
			} else {
				System.out.println("Your new Password is " + password);
				account.setPassword(newPasswords);
			}

		} else {
			System.out.println("Sorry Worng Password!!!");
		}

	}

	
}
