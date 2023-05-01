package hangman2;

import java.util.Scanner;

public class MainHangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hangman hang = new Hangman();
		hang.randumNamesSelection();

		System.out.println("You have gussed (" + hang.wrongAttempt + ") wrong letters :");

		for (int i = 4; i >= hang.wrongAttempt;) {

			System.out.println("Guess the letter :");

			Scanner sc = new Scanner(System.in);
			String guessedLetter = sc.next();

			hang.checkGivenLetterPresent(guessedLetter);

		}

	}

}
