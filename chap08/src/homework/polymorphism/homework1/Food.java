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
	//유통기한이 남은 일자에 따라서 달라지는 할인율을 정수형태로 리턴
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
	
	//부모 클래스의 메소드를 오버라이딩해서 구현
	//calculateDiscountRate 함수를 호출하여 할인 %
	@Override
	public int calculatePrice() {
		return super.getPrice() * calculateDiscountRate() / 100;
	}


	

}
