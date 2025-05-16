package Homework2;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
	// 1. 1~50까지 짝수 합하기
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수(1~50) : ");
		int num = scanner.nextInt();
		
		int sum = 0;
		while (true) {
			if ((num < 0) || (num > 50)) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				System.out.print("정수(1~50) : ");
				num = scanner.nextInt();
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						sum += i;
					}
				}
				break;
			}
		}
		System.out.println("합계 : " + sum);
	
		
		
	}
}
