package homework.polymorphism.homework3;

public class Run {
	public static void main(String[] args) {
		
		
		Engine en1 = new GasolineEngine();
		Car c1 = new Car(en1);
		
		
		Engine en2 = new GasolineEngine();
		Car c2= new Car(en2);

		
		c1.startEngine();
		c2.startEngine();
		
	}
}
