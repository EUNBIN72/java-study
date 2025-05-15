package Homework;

import java.util.Scanner;

public class homework1 {
	
	public static void main(String[] args) {
		// 1. 철수의 앵무새
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		String bird = scanner.nextLine();
		
		String result = (bird.equals("간다") ) ? "온다" : "간다" ;
//		더 좋은 코드
//		String result = "간다".equals(bird)  ? "온다" : "간다" ;
		
		System.out.println("앵무새: " + result);
	}

}
