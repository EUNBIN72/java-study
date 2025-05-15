package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// 1. 보건교사 김철수
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생의 키를 입력하세요(m): ");
		double height = scanner.nextDouble();
		
		System.out.print("학생의 몸무게를 입력하세요: ");
		double weight = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.printf("BMI 지수: %.2f" , bmi);
		
		
	
		
		
	}

}
