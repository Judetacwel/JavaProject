package Multiplication;

public class DoWhile {

	int number;
	int initialNumber = 1;

	void printMultiples() {
		int finalNumber = 10;

		do {
			System.out.println(number * initialNumber);
			initialNumber++;
		} while (initialNumber <= finalNumber);

	}
}
