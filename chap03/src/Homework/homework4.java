package Homework;

import java.util.Scanner;

public class homework4 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int ko = scanner.nextInt();
		
		System.out.print("수학 : ");
		int math = scanner.nextInt();
		
		System.out.print("영어 : ");
		int en = scanner.nextInt();
		
		int total = ko + math + en;
		System.out.println("합계 : " + total + "점");
		
		// JAVA에서는 F나 f가 없는 실수 리터럴을 double 타입으로 해석
		// 연산 결과는 double 타입 변수에 저장해야 됨
		double avg = total / 3.0;
		// total이나 나눠줄 3을 double 타입으로 바꿔줘야 함
		System.out.println("평균 : " + avg + "점");
		
		String result = (ko >= 60) && (math >= 60) && (en >= 60) && (avg >= 90) ?
				"휴대폰을 바꿀 수 있습니다" :
				"휴대폰을 바꿀 수 없습니다." ;
		System.out.println(result);
		
	}
}
