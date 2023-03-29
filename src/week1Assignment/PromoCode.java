package week1Assignment;

public class PromoCode {

	String promCode;
	float totalPrice;
	float priceOfProduct;
	int discount;
	float finalDiscount;
	float finalPrice;

	void allProductDiscount() {
		totalPrice = priceOfProduct / 2;
		System.out.println("50% discount is given to all products so your total price before applying Promo Code is "
				+ totalPrice);
	}

	void promoCodeDiscount() {
		if (promCode == "PROMO5") {
			discount = 50 + 5;
			finalDiscount = (priceOfProduct * discount) / 100;
			finalPrice = priceOfProduct - finalDiscount;
			System.out.println("You have additional discount. Your total discount is " + discount + "%");
			System.out.println("Your final price is " + finalPrice);

		} else if (promCode == "PROMO10") {
			discount = 50 + 10;
			finalDiscount = (priceOfProduct * discount) / 100;
			finalPrice = priceOfProduct - finalDiscount;
			System.out.println("You have additional discount. Your total discount is " + discount + "%");
			System.out.println("Your final price is " + finalPrice);

		} else if (promCode == "PROMO20") {
			discount = 50 + 20;
			finalDiscount = (priceOfProduct * discount) / 100;
			finalPrice = priceOfProduct - finalDiscount;
			System.out.println("You have additional discount. Your total discount is " + discount + "%");
			System.out.println("Your final price is " + finalPrice);

		}
	}

}
