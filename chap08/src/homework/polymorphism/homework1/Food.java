package homework.polymorphism.homework1;

public class Food extends Product {
	//필드
	private int expirationDays;

	
	//생성자
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	
	//getter()/setter()
	public int getExpirationDays() {
		return expirationDays;
	}


	//메소드
	public int calculateDiscountRate() {
		if (expirationDays <= 1) {
			return 80;
		} else if (expirationDays <= 5) {
			return 50;
		} else if (expirationDays <= 10) {
			return 20;
		} else {
			return 100;
		}
	}
	
	public int calculatePrice() {
		return super.getPrice() * calculateDiscountRate() / 100;
	}


	

}
