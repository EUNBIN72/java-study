package sec02.exam06;

public class UserServiceExample {
	public static void main(String[] args) {
		UserService service = new UserService();
		
		try {  
			//예외 발생 코드 
			service.registerUser(10);
			service.registerUser(-5);
		} catch (InvalidAgeException e) {  // e : 예외 객체
			System.out.println("예외 발생: " + e.getMessage());  //예외 메시지 출력
		}
	}
}
