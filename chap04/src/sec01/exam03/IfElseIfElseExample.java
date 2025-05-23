package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 83;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {  // 80 <= score < 90
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {  // 70 <= score < 80
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C입니다.");
		} else {  // score < 70
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
			
		// 정리 :
		// 1. 조건식을 여러 개 작성할 수 있다. (개수는 제한 없음)
		// 2. 조건식이 true가 되는 블록만 실행하고 if문을 빠져나감
		
		// Quiz
//		한 개의 문자를 입력받아
//		대문자, 소문자, 숫자, 기타문자인지를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		  A  => 대문자
//		  a  => 소문자
//		  0  => 숫자
//		  가  => 기타문자
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력하세요: ");
		char letter = scanner.nextLine().charAt(0);
		
		if (letter >= 65 && letter <= 90) {
			System.out.println("대문자");
		} else if (letter >= 97 && letter <= 122 ) {
			System.out.println("소문자");
		} else if ( letter >= 48 && letter <= 57) {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}


	}

}
