package Homework;

import java.util.Scanner;

public class homework1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		
		int fee;
		
		if (age <3 ) {
			fee = 0;			
		} else if (age <= 12) {
			fee = 10000;
		} else if (age <= 18) {
			fee = 20000;
		} else if (age <= 64) {
			fee = 30000;
		} else {
			fee = 0;
		}
		System.out.println("놀이동산 요금은 " + fee + "입니다.");
		
	}
}
