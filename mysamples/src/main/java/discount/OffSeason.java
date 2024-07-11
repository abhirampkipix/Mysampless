package discount;

public class OffSeason {

	public void discount(double price) {
		double discountrate=0.15;
		double discountprice=price-(price*discountrate);
		System.out.println("Offseason discout :"+discountprice);
		
	}

}
