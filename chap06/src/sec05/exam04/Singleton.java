package sec05.exam04;

public class Singleton {
	// Step2
	private static final Singleton singleton = new Singleton();
	// private으로 외부에서 변경 못하게 막기
	// => 단 하나의 객체만 만들어 사용하기 위해
	
	// Step1
//	Singleton(){} // 외부에서 호출 가능 -> 여러 개의 객체 생성 가능
	private Singleton() {}  // private: 비공개, 외부에서 new 연산자로 호출 불가
	
	// Step3
	public static Singleton getInstane() {
		// 자기 자신의 객체를 리턴
		return singleton;
	}
}
