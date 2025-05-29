package homework.polymorphism.homework1;

//자식 클래스
public class Food extends Product {
	//필드
	private int expirationDays;

	
	//생성자
	public Food() {
		
	}
	
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
	// 1. 유통기한 1일 이하인 경우 80
	// 2. 유통기한이 5일 이하인 경우 50
	// 3. 유통기한이 10일 이하인 경우 20
	// 4. 그외는 할인 없음
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
