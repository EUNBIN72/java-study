package sec04.exam01;

public class Calculator {
	// 메소드
	//void는 리턴값 없음
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide (int x, int y) {
		double result = (double) x / (double) y;  // 둘 중 하나만 double로 바꿔줘도 됨
		return result;
	}
	
	
	
	
	
}
