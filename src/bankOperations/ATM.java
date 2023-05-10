package bankOperations;

public class ATM extends BankOperations {
	


	@Override
	void
	withDraw(PersonalAccountDetails account) {
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
		double amountDepostied = sc.nextInt();
		double balance = account.getBalance();
		balance += amountDepostied;
		System.out.println("You have deposited " + amountDepostied+" balance :"+balance);
		
		account.setBalance(balance);

	}

	

	@Override
	public void changePinPassword(PersonalAccountDetails account) {

		System.out.println("Please Enter the old PIN");
		int oldPin = sc.nextInt();
		if (oldPin == account.getPinNumber()) {
			System.out.println("Enter the new PIN");
			int newPin = sc.nextInt();

			if (oldPin == newPin ) {

				System.out.println("Sorry New Pin Is Same as Old Pin!!!");

			} else {

				System.out.println("New PIN  is " + newPin);
				account.setPin(newPin);
			}
		}

	}

	

}
