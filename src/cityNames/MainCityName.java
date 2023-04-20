package cityNames;

import java.util.Scanner;

public class MainCityName {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CityNames city = new CityNames();
		
		System.out.println("Enter the city name");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String CityNameToSearch = sc.next();

		

		String FoundedName=city.searchCityName(CityNameToSearch);
		if(CityNameToSearch.equals(FoundedName)) {
			System.out.println(FoundedName +" IS FOUND IN THE LIST");
		}else {
			System.out.println("City not found in the lsit......");
			
		}
		city.endsWithGivenChar("ton");
		city.extractWords();
		

		
	}

}
