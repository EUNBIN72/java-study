package sec03.exam03;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car () {  // 1번
		
	}
	
	Car (String model) {  // 2번
		this.model = model;
	}

	// 주의! 매개변수 이름만 바꾸는 것은 오버로딩이 아님(타입이 중요!)
//	Car (String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
	
	Car (String model, String color) {  // 3번
		this.model = model;
		this.color = color;
	}
	
	Car (String model, String color, int maxSpeed) {  // 4번
		this.model = model; 
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 총 4개의 생성자 오버로딩
	
	// Quiz : 오버로딩 가능?  => 가능
	// 매개변수의 타입, 순서가 달라서 가능함
	Car(String model, int maxSpeed, String color) {
		this.model = model; 
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
