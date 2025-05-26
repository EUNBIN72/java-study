package sec02.exam01;

public class Car {
	// 자동차는 타이어가 필요
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	// 자동차니까 달리는 기능 필요
	// 네 군데의 바퀴가 굴러가게
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
		
		
		
	}
}
