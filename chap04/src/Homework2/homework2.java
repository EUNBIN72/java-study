package Homework2;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// 2. 구구단 무한반복
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = scanner.nextInt();
		
		
		while (true) {
			if ((num >= 1) && (num <= 9)) {
				for (int i = num; i <= 9; i++) {
					System.out.println();
					System.out.println("===" + i + "단===");
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + (i*j) );
					}
				}
				System.out.print("숫자 : ");
				num = scanner.nextInt();
			
			} else if (num < 0) {
				System.out.println("양수만 입력해주세요.");
				System.out.print("숫자 : ");
				num = scanner.nextInt();
			} else if (num > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
				System.out.print("숫자 : ");
				num = scanner.nextInt();
			} else if (num == 0) {
				System.out.println("프로그램을 종료하세요.");
				break;
			}
			
		}
		
		
		
		
		

		
		
	}
}
