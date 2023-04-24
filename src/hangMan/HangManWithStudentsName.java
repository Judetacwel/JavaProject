package hangMan;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangManWithStudentsName {
	
	Random ra =new Random();
	String[] studentNames= {"Aleena","Angel","Asha","Clemin","Gopesh","Hamneet","Jimna","Jobin","Jude","Kamaldeep","Manpreetk","Manpreets","Mariya","Namitha","Neelam","Nisha","Parminder","Rajat","Rojy","Sojan","Suchithra","Vindhuja"};
	char nameindex;
	String selectedName;
	String[] selectedNameInArray;
	int count=0;
	String letter;
	char chara;
	
	Scanner sc= new Scanner(System.in);
	String guessedLetter = sc.next();
	
	void randumNames() {
	
		int selectedNumber = ra.nextInt(studentNames.length);
		
		 selectedName=studentNames[selectedNumber];		 

			int len=selectedName.length();
			String star= "_ ";		
			System.out.println("You are guessing : "+star.repeat(len));
	}
	
	
	void checkingInput(){
		
		
		
		
	}
	

	
	
	
}
