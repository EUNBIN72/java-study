package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		// 5. 총점과 평균 계산하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		double ko = scanner.nextDouble();
		
		System.out.print("영어 점수를 입력하세요: ");
		double en = scanner.nextDouble();
		
		System.out.print("수학 점수를 입력하세요: ");
		double math = scanner.nextDouble();
		
		double total = ko + en + math;
		double avg = (ko + en + math) / 3;
		
		System.out.println("총점: " + (int) total);
		System.out.print("평균: " + (int) avg);
		
		

	}

}
