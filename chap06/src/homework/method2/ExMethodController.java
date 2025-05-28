package homework.method2;

public class ExMethodController {
	// 전달된 메시지 출력하는 메소드
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	// 1~100까지 합을 반환하는 메소드
	public int sum1To100() {
		int sum = 0; 
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 전달된 정수가 홀수인지 짝수인지 반환하는 메소드
	public String checkEvenOdd(int number) {
		String result = "홀수";
		if (number % 2 == 0) {
			result = "짝수";
		}
		return result;
	}
	
	// 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드
	public boolean hasEnglishChar(String text) {
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				return true;
			}
		}
		
		return false;
	}
	
	// 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드
	public void checkCharCount(String text, char check) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == check) {
				count++;
			}
		}
		System.out.println(count + "개");
	}
	
	// 전달된 정수의 구구단을 출력하는 메소드
	public void printGoogoodan(int num) {
		System.out.println("=== " + num + "단 ===");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

}
