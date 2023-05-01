package hangMan;


public class MainHangMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HangManWithStudentsName hang =new HangManWithStudentsName();
		hang.randumNames();

		System.out.println("You have gussed ("+hang.count+") wrong letters :");
		
		System.out.println("Guess the letter :");
		
		
	}

}
