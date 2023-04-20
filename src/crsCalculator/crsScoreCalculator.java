package crsCalculator;

import java.util.Scanner;

public class CrsScoreCalculator {

	Scanner sc = new Scanner(System.in);
	int educationPoints;
	int experiencePoint;
	int agePoint;
	int ieltsListeningPoints;
	int ieltsSpeakingPoints;
	int ieltsRedingPoints;
	int ieltswritingPoints;
	int relativesPoint;
	int studiesPoint;
	int workExperiencePoint;
	int totalPoints;

	void totalPoints() {
		totalPoints = educationPoints + experiencePoint + agePoint + ieltsListeningPoints + ieltsSpeakingPoints
				+ ieltsRedingPoints + ieltswritingPoints + relativesPoint + studiesPoint + workExperiencePoint;
		System.out.println("Total Points you have scored: " + totalPoints);
		if (totalPoints >= 67) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		} else {
			System.out.println("You are not qualifed to submit an Expression of Interest (EOI) to Immigration Canada");
		}

	}

	void education() {
		System.out.println("Enter your Education Level :");
		String educationOfCandidate = sc.nextLine();

		switch (educationOfCandidate) {

		case "PhD":
			educationPoints = 25;
			break;
		case "Masters":
			educationPoints = 23;
			break;
		case "university degrees":
			educationPoints = 22;
			break;
		case "longer Degree ":
			educationPoints = 21;
			break;
		default:
			System.out.println("Wrong input");
			break;
		}

	}

	void experience() {
		System.out.println("Enter your Experience in years:");
		int experienceOfCandidate = sc.nextInt();
		if (experienceOfCandidate <= 6) {
			experiencePoint = 13;
		} else if (experienceOfCandidate > 6) {
			experiencePoint = 15;
		} else {
			experiencePoint = 0;
		}
	}

	void age() {

		System.out.println("Enter your age in years:");
		int ageOfCandidate = sc.nextInt();

		int[] ageRange = { 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
				41, 42, 43, 44, 45, 46, 47 };

		for (int i = 0; i < ageRange.length; i++) {
			if (ageRange[i] == ageOfCandidate) {

				int ageGiven = ageRange[i];
				if (ageGiven >= 18 && ageGiven <= 35) {
					agePoint = 12;
					break;
				} else if (ageGiven > 35 && ageGiven < 47) {

					int[] ageRangeVariation = { 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46 };
					int[] agePointVariation = { 11, 10, 9, 8, 07, 06, 05, 04, 03, 02, 01 };

					for (int j = 0; j < ageRangeVariation.length; j++) {

						if (ageRangeVariation[j] == ageGiven) {
							agePoint = agePointVariation[j];
							break;
						}
					}

				} else if (ageGiven > 46 || ageGiven < 18) {
					agePoint = 00;
				}

			}

		}
	}

	void ieltsListening() {

		System.out.println("Enter your IELTS Score for Listening:");
		float listeningScore = sc.nextFloat();

		if (listeningScore >= 8 && listeningScore <= 9) {

			ieltsListeningPoints = 6;

		} else if (listeningScore == 7.5) {
			ieltsListeningPoints = 5;
		} else {
			ieltsListeningPoints = 0;
		}

	}

	void ieltsSpeaking() {
		System.out.println("Enter your IELTS Score for Speaking:");
		float speakingScore = sc.nextFloat();

		if (speakingScore >= 7 && speakingScore <= 9) {
			ieltsSpeakingPoints = 6;
		} else if (speakingScore == 6.5) {
			ieltsSpeakingPoints = 5;
		} else {
			ieltsSpeakingPoints = 0;
		}

	}

	void ieltsReading() {
		System.out.println("Enter your IELTS Score for Reading:");
		float readingScore = sc.nextFloat();

		if (readingScore >= 7 && readingScore <= 9) {
			ieltsRedingPoints = 6;
		} else if (readingScore == 6.5) {
			ieltsRedingPoints = 5;
		} else {
			ieltsRedingPoints = 0;
		}

	}

	void ieltsWriting() {
		System.out.println("Enter your IELTS Score for Writing:");
		float writingScore = sc.nextFloat();

		if (writingScore >= 7 && writingScore <= 9) {
			ieltswritingPoints = 6;
		} else if (writingScore == 6.5) {
			ieltswritingPoints = 5;
		} else {
			ieltswritingPoints = 0;
		}

	}

	void canadianstudies() {

		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		String candidateInputOfStudies = sc.next();
		if (candidateInputOfStudies.equals("Y")) {
			studiesPoint = 5;
		} else {
			studiesPoint = 0;
		}
	}

	void canadianWorkExperience() {
		System.out.println("HAve you Worked in Canada for one year at NOC 0, A, B (Y/N)");
		String workexperienceInput = sc.next();
		if (workexperienceInput.equals("Y")) {
			workExperiencePoint = 10;
		} else {
			workExperiencePoint = 0;
		}
	}

	void relatives() {
		System.out.println(
				"If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		String relativesInput = sc.next();
		if (relativesInput.equals("Y")) {
			relativesPoint = 5;
		} else {
			relativesPoint = 0;
		}

	}

}
