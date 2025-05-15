package Homework;

import java.util.Scanner;

public class homework2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구슬의 개수 : ");
		int num1 = scanner.nextInt();
		
		String result = (num1 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(result);
	}
}
