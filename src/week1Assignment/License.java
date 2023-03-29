package week1Assignment;

public class License {

	int age;
	String currentLicense;

	void ageValidate() {
		if (age >= 18) {
			System.out.println("your age is " + age + " You are eligible to apply for G License");
		
			if (currentLicense == "G1") {
				System.out.println("You are eligible for G2");
			} else if (currentLicense == "G2") {
				System.out.println("Your are eligible for G");
			} else if(currentLicense=="G") {
				System.out.println("You are fully licensed");
			}
			else {
				System.out.println("Go for G1");
			}

		} else {
			System.out.println("You are not eligible to apply for License");
		}
	}

}
