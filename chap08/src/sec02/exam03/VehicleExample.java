package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();  //Bus 객체를 넣음
		
		vehicle.run();
//		vehicle.checkFare();  // Vehicle 인터페이스 타입에 없는 멤버는 사용 불가
		
		// Bus 타입으로 강제 변환
		// (상위타입 vehicle을 하위타입 bus로 타입변환)
		Bus bus = (Bus) vehicle;
		
		// 강제타입변환을 했기 때문에 run과 checkFare 둘 다 사용 가능
		bus.run();	
		bus.checkFare();

	}

}
