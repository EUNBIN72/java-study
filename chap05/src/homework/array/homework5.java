package homework.array;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		// 5. 컴퓨터와 가위바위보
		
		String[] choice = {"가위", "바위", "보"};
		
		// 카운터 변수
		int count = 0;
		int userWins = 0;
		int userLosses = 0;
		int draws = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("가위바위보: ");
			String me = sc.nextLine();
			
			
			// 예외 먼저 출력
			if (me.equals("stop")) {
				System.out.println(count + "전 " + userWins + "승 " +draws + "무 " + userLosses + "패");
				break;
			}
			
			// 유효성 검사
			if (!(me.equals("가위")) && !(me.equals("바위")) && !(me.equals("보"))) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}
			
			int com = (int) (Math.random() * 3);
			
			System.out.println("컴퓨터 : " + choice[com]);
			System.out.println("사용자 : " + me);
			
	
			
			if (me.equals(choice[com])) {
				System.out.println("비겼습니다");
				draws++;
			} else if ((choice[com].equals("가위")  && me.equals("바위")) ||
					  (choice[com].equals("바위")  && me.equals("보")) ||
					  (choice[com].equals("보") && me.equals("가위"))) {
				System.out.println("이겼습니다!!");
				userWins++;
			} else  {
				System.out.println("졌습니다ㅠㅠ");
				userLosses++;
			} 
			count++;
			System.out.println();

		} 
		
		
	}
}
