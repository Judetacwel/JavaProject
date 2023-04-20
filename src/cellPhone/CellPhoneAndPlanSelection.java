package cellPhone;

import java.util.Scanner;

public class CellPhoneAndPlanSelection {
	Scanner sc = new Scanner(System.in);
	String phoneSelected;
	String planSelected;
	int phoneAmount;
	int planAmount;
	int totalMonthlyamount;

	void PhoneSelection() {
		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung");
		String phoneSelected = sc.nextLine();
		if (phoneSelected.equals("Apple")) {
			apple();
		} else if (phoneSelected.equals("Samgsung")) {
			samgsung();
		}

	}

	void apple() {
		System.out.println("Please enter the model that you want to buy from below" + '\n' + "Iphone 14" + '\n'
				+ "Iphone 14 Pro" + '\n' + "Iphone 14 Pro Max" + '\n' + "Iphone 14 mini");
		String iphoneSelected = sc.nextLine();

		switch (iphoneSelected) {
		case "Iphone 14":
			phoneSelected = "Iphone 14";
			phoneAmount = 30;
			break;
		case "Iphone 14 Pro":
			phoneSelected = "Iphone 14 Pro";
			phoneAmount = 40;
			break;
		case "Iphone 14 Pro Max":
			phoneSelected = "Iphone 14 Pro Max";
			phoneAmount = 65;
			break;
		case "Iphone 14 mini":
			phoneSelected = "Iphone 14 mini";
			phoneAmount = 25;
			break;
		default:
			System.out.println("Please Enter correct input");
			break;

		}
	}

	void samgsung() {
		System.out.println("Please enter the model that you want to buy from below" + '\n' + "S22" + '\n' + "S22+"
				+ '\n' + "S22 Ultra" + '\n' + "S22FE");
		String samgsungSelected = sc.nextLine();

		switch (samgsungSelected) {
		case "S22":
			phoneSelected = "S22";
			phoneAmount = 25;
			break;
		case "S22+":
			phoneSelected = "S22+";
			phoneAmount = 35;
			break;
		case "S22 Ultra":
			phoneSelected = "S22 Ultra";
			phoneAmount = 55;
			break;
		case "S22FE":
			phoneSelected = "S22FE";
			phoneAmount = 20;
		default:
			System.out.println("Please Enter correct input");
			break;
		}

	}

	void plan() {
		System.out.println("Please select the plan that you want to opt for: Rogers/ Telus/ Bell");
		String planInput = sc.nextLine();

		switch (planInput) {
		case "Rogers":
			planSelected = "Rogers";
			planAmount = 70;
			break;
		case "Telus":
			planSelected = "Telus";
			planAmount = 75;
			break;
		case "Bell":
			planSelected = "Bell";
			planAmount = 80;
			break;
		default:
			System.out.println("Please Enter correct input");
			break;

		}
	}

	void totalAmountOfPhoneAndPlan() {
		totalMonthlyamount=phoneAmount+planAmount;
		System.out.println("You have Selected " + phoneSelected + " with " + planSelected + " Plan.");
		System.out.println("Your Phone Tab will be : "+phoneAmount);
		System.out.println("Your Monthly Plan Will be : "+planAmount);
		System.out.println("Total Monthly Amount : "+totalMonthlyamount);

	}

}
