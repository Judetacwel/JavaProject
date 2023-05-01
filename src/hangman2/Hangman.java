package hangman2;

import java.util.Random;

public class Hangman {
	String[] studentNames = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchithra", "Vindhuja" };

	String selectedName;
	String[] selectedNameInArray;

	int wrongAttempt = 0;

	char[] selectedNameArray = new char[10];

	void randumNamesSelection() {

		Random ra = new Random();

		int selectedNumber = ra.nextInt(studentNames.length);
		selectedName = studentNames[selectedNumber];
		char[] dashArray = new char[selectedName.length()];

		for (int i = 0; i < selectedName.length(); i++) {
			dashArray[i] = '_';

		}
		selectedNameArray = dashArray;

		String star = "_ ";
		System.out.println("You are guessing : " + star.repeat(selectedName.length()));

	}

	String checkGivenLetterPresent(String givenLetter) {

		int index = selectedName.indexOf(givenLetter);

		if (selectedName.contains(givenLetter)) {

			selectedNameArray[index] = givenLetter.charAt(0);

			System.out.println(selectedNameArray);

		} else {
			wrongAttempt++;

			System.out.println("You have gussed " + wrongAttempt + " wrong letters");
		}

		return null;
	}

}
