package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		// 04. 유니코드 출력하기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		String inputData = scanner.nextLine();
		
		char code = inputData.charAt(0);
		System.out.println(inputData + "의 유니코드: " + (int)code);

	}

}
