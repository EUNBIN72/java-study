package homework.exception.homework1;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
	// 1. 오류가 아니에요!!
	
	// 1~50 사이의 숫자 중 랜덤한 숫자 도출
	int randomNum = (int) (Math.random() * 50 + 1);	
	System.out.println("랜덤 숫자 : " + randomNum);
	
	
	
	Scanner sc = new Scanner(System.in);
	
	while (true) {
		try {
			
			System.out.print("1~50 사이의 숫자 : ");
			int num = sc.nextInt();
			
			if (randomNum < num) {
				System.out.println("DOWN!");
			} else if (randomNum > num) {
				System.out.println("UP!!");
			} else if (randomNum == num) {
				System.out.println("축하합니다~ 정답이에요");
				break;
			}
		
		} catch (Exception e) {
			System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
			sc.nextLine();
			
		} 	
	}	
	
	
	}
}
