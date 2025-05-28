package sec01.exam16;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject =  "자바 프로그래밍";
//		String subject =  "C 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");  // 찾는 문자열
		System.out.println(location);  //"프로그래밍"이 시작하는 인덱스를 출력
		
		if (subject.indexOf("자바") != -1) {  // 문자열이 포함되어 있으면
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		// 추가 실습: 문자열 포함 여부를 알려주는 메소드
		// 자바스크립트의 includes 랑 같은 역할하는 contains
		if (subject.contains("자바")) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

	}

}
