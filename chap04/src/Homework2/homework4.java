package Homework2;

import java.util.Scanner;

public class homework4 {

	
	public static void main(String[] args) {
		// 4. 게임 재시작
		

		Scanner scanner = new Scanner(System.in);
		String play;
		
		// do 블록 안의 코드는 아래 while 조건 확인 전에 무조건 한 번은 실해 됨
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까? (yes/no)");
			play = scanner.nextLine();
		} while (play.equals("yes"));
		System.out.println("게임을 종료합니다.");
	}
}
