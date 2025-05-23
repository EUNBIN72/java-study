package sec03.exam02;

public class Cat extends Animal {

	//생성자
	public Cat() {
		this.kind = "포유류";
	}
	
	
	//자식쪽에서 재정의
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}
