package week1Assignment;

public class LargestOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 5;
		int n2 = 44;
		int n3 = 22;
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("Largest number is " + n1);
			} else {
				System.out.println("Largest number is " + n3);
			}

		} else if (n2 > n3) {
			System.out.println("Largest number is " + n2);
		} else {
			System.out.println("Largest number is " + n3);
		}

	}

}
