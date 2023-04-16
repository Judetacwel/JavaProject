package InterviewQuestion;

import java.util.Scanner;

public class ClassArray {
	Scanner sc = new Scanner(System.in);
	
	
	void numbers() {
		
		
		int[] number=new int[50];
		
		System.out.println("Enter the numbers :");

		for(int i=0;i<number.length;i++) {
			
			number[i] = sc.nextInt();

		}
		for(int j=0;j<number.length;j++) {
			System.out.println(number[j]);

		}
		
	}
	

	
}
