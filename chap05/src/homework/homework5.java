package homework;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// 5. 컴퓨터와 가위바위보
		
		while (true) {
			String[] choice = {"가위", "바위", "보"};
			
			Scanner sc = new Scanner(System.in);
			int com = (int) (Math.random() * 3);
			
			System.out.print("가위바위보: ");
			int me = sc.nextInt();
			
			System.out.print("컴퓨터: ");
			if (com == 0) {
				System.out.println("가위");
			} else if (com == 1) {
				System.out.println("바위");
			} else {
				System.out.println("보");
			}
			
			System.out.print("사용자: ");
			if (me == 0) {
				System.out.println("가위");
			} else if (me == 1) {
				System.out.println("바위");
			} else {
				System.out.println("보");
			}
			
			if (me == com) {
				System.out.println("비겼습니다");
			} else if ((com == 2 && me == 0) || (com == 1 && me == 2) || (com == 0 && me == 1)) {
				System.out.println("이겼습니다!!");
			} else {
				System.out.println("졌습니다ㅠㅠ");
			}
		
			if (sc.equals("stop")) {
				break;
			}
			
		} 
		System.out.println("");
	}
}
