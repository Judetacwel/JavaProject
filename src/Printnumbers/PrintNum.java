package Printnumbers;

public class PrintNum {

	void printnumber() {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				for (int j = i; j % 5 == 0;j++) {
					System.out.println(j);

				}

			}

		}
	}

}
