package Homework;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("각 과목의 점수를 입력하세요.");
		
		
		System.out.print("소프트웨어설계 점수 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("소프트웨어개발 점수 : ");
		int num2 = scanner.nextInt();
		
		System.out.print("데이터베이스구축 점수 : ");
		int num3 = scanner.nextInt();
		
		System.out.print("프로그래밍언어활용 점수 : ");
		int num4 = scanner.nextInt();
		
		System.out.print("정보시스템구축관리 점수 : ");
		int num5 = scanner.nextInt();
		
		int avg = (num1 + num2 + num3 + num4 + num5) / 5;
		
		
		if (avg  < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else if (num1 < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if (num2 < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (num3 < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (num4 < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (num5 < 40) {
			System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		} else {
			System.out.println("합격을 축하합니다!!");
		}
		
		

	}

}
