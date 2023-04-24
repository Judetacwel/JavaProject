package hangMan;


public class MainHangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HangManWithStudentsName hangman = new HangManWithStudentsName();
		hangman.randumNames();

		System.out.println("You have gussed ("+hangman.count+") wrong letters :");
		
		System.out.println("Guess the letter :");
		
		
	}

}
