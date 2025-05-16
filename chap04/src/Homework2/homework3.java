package Homework2;

import java.util.Scanner;

public class homework3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		for (;;) {
			System.out.print("입력 : ");
			String len = scanner.nextLine();
			System.out.println(len);
			
			if ("탈출".equals(len)) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.print("입력 : ");
				len = scanner.nextLine();
				System.out.println(len);
			}
			
			
		}
		
		
	}

}
