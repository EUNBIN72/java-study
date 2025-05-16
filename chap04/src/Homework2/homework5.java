package Homework2;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// 5. 양수만 더하기
		
		int sum = 0;
		int a = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자(0을 입력하면 종료) : ");
		int num = scanner.nextInt();
		

		while (true) {
			if (num > 0) {
				sum += num;
				System.out.print("숫자(0을 입력하면 종료) : ");
				num = scanner.nextInt();
			} else if (num < 0) {
				System.out.print("숫자(0을 입력하면 종료) : ");
				num = scanner.nextInt();
			} else if (num == 0) {
				System.out.println("양수의 합계 : " + sum);
				break;
			}
		}
		
	}
}
