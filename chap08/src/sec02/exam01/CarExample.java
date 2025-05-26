package sec02.exam01;

// 실행 클래스
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// 앞바퀴들의 타이어를 금호 타이어로 교체
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
