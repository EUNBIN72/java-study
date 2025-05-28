package sec01.exam06;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		// toString() 재정의 전, 후 결과 비교
		System.out.println(myPhone.toString());
		// 재정의 전 : sec01.exam06.SmartPhone@54bedef2
		// 재정의 후 : 구글, 안드로이드
	}

}
