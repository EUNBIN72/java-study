package sec02.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		// 재정의된 run이 실행됨
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi(); 
		driver.drive(taxi);

	}

}
