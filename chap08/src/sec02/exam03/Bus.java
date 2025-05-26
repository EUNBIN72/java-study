package sec02.exam03;

public class Bus implements Vehicle {

	//인터페이스 구현
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	//버스만 가지는 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
