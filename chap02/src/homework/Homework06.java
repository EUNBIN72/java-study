package homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// 6. 제곱 계산하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		char str = scanner.nextLine().charAt(0);
		
		// char 타입의 숫자값을 정수로 변환하여 계산
		int number = str - '0';
		
		int num = number * number;
		
		System.out.println("입력한 숫자의 제곱은 " + num + "입니다");

	}

}
