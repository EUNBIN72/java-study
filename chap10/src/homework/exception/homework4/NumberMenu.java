package homework.exception.homework4;

import java.util.Scanner;

import homework.exception.homework3.CharCheckException;

public class NumberMenu {
	
	public void menu() {
		// 사용자에게 두 정수 입력 받음
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		
		// NumberController의 checkDouble에 매개변수 넘겨줌
		
		NumberController nc = new NumberController();
		// 반환값 출력
		// checkDouble() 메소드 호출부분을
		// try~catch를 이용하여 예외처리
		
		try {
			System.out.println(num1 + "은(는)" + num2 + "의 배수인가? " + nc.checkDouble(num1, num2));
		} catch (NumRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
