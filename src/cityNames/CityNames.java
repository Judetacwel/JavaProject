package cityNames;

public class CityNames {

	String[] nameOfCities = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchener" };
	String matchFound;

	String searchCityName(String CityName) {
		for (int i = 0; i < nameOfCities.length; i++) {
			if (nameOfCities[i].equals(CityName)) {
				matchFound = nameOfCities[i];
				break;
			}
		}
		return matchFound;
	}

	void endsWithGivenChar(String givenChar) {

		String[] lastNameArray = new String[matchFound.length()];
		for (int i = 0; i < nameOfCities.length; i++) {
			if (nameOfCities[i].endsWith(givenChar)) {
				lastNameArray[i] = nameOfCities[i];
				System.out.println(lastNameArray[i]);
				System.out.println(nameOfCities[i].replace("ton", "fun"));
			}
		}

	}

	void extractWords() {

		String str = "100 queen street,Toronto,M5V 3E3 ";

		String splitednames[] = str.split(",");

		for (int i = 0; i < 3; i++) {

			System.out.println(splitednames[i]);

		}
	}

}
