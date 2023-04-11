package PrimeNumber;

import java.util.Scanner;

public class primeNumber {

	void prime() {
		int number;
		boolean isPrime=true;
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a positive number:");
		//capture the input in an integer
		int num=scan.nextInt();
		for(int i=2;i<=num/2;i++)
		{
	           number=num%i;
		   if(number==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   }
	

}
