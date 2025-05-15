package Homework;

import java.util.Scanner;

public class homework3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("철수의 친구 수 : ");
		int member = scanner.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = scanner.nextInt();
		
		int per = candy / member;
		System.out.println("1인당 사탕 개수 : " + per + "개");
		
		int result = candy % member;
		System.out.println("남는 사탕 개수 : " + result + "개");
	}
}
