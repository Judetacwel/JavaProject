package week1Assignment;

public class DiscountCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PromoCode promo = new PromoCode();
		promo.promCode="PROMO20";
		promo.priceOfProduct=100;
		
		promo.allProductDiscount();
		promo.promoCodeDiscount();
	}

}
