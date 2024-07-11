package discount;

public class OnSeason extends OffSeason {

		public void discount(double price) {
			double discountrate=0.40;
			double discountprice=price-(price*discountrate);
			System.out.println("Onseason discout :"+discountprice);
			super.discount(price);
		}
			public static void main(String[] args) {
			double price=1000.0;

			OnSeason on=new OnSeason();
	on.discount(price);
		}
		}


