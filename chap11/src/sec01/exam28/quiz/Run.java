package sec01.exam28.quiz;

import java.util.Scanner;

public class Run {
	// Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.
	
	public static void main(String[] args) {
		// 공식화 : (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반 전체 학생 수를 입력하세요 : ");
		int total = sc.nextInt();
		sc.nextLine();  // 개행 문자 제거(버퍼 지우기)
		
		String[] totalList =  new String[total];
		
		for (int i = 0; i < totalList.length; i++) {
			System.out.print("학생들 이름을 입력하세요 : ");
			totalList[i] = sc.nextLine();
		}
		
	
		int ran = (int) (Math.random() * totalList.length);
		System.out.println("오늘 커피 쏠 사람: " + totalList[ran]);
		
		
		
		
	}
}
