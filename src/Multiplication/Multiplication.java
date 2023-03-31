package Multiplication;

public class Multiplication {

	int number;
	int initialNumber=1;

	void printMultiples() {
		int finalNumber =10;
		while (initialNumber <= finalNumber) {
			System.out.println(initialNumber*number);
			initialNumber ++;
		}
	}

}
