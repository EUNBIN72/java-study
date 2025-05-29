package homework.polymorphism.homework3;

public class Car {
	//필드
	private Engine engine;
	
	//생성자
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void startEngine () {
		engine.start();
	}

}
