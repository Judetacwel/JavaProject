package bankOperations;

public class OnlineBanking extends BankOperations {

	public void chooseOPeration() {

		System.out.println("What operation you like to do : deposit / withdraw / balance");
		String choosedOperation = sc.next();

		switch (choosedOperation) {
		case "deposit":
			deposit();
			break;
		case "withdraw":
			withDraw();
			break;
		case "balance":
			viewBalance();
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
		

	}
}
