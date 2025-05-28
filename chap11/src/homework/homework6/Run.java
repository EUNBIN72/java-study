package homework.homework6;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 6. Fox 옆에 Dog
		
		// 문자열 변수 사용
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		// 사용자로부터 단어를 입력받습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("단어를 입력하세요: ");
		String str = sc.nextLine();
		
		// 공백을 기준으로 문자열을 단어로 분리
		String[] words = sentence.split(" ");
		
		// 입력받은 단어가 sentence에 존재하는지 확인
		
		for (int i = 0; i < words.length; i++) {
			// 문자열에 입력한 단어가 있을 때
            if (words[i].equals(str)) {
            	// 만약 입력된 단어가 마지막 단어라면, “마지막 단어입니다.”라고 출력
                if (i == words.length - 1) {
                    System.out.println("마지막 단어입니다.");
                } else {  	
                	// 해당 단어 뒤에 오는 단어를 출력
                    System.out.println(str + " 다음 단어 : " + words[i + 1]);
                }
                return;  // main 메서드 종료 (즉 프로그램 종료)
            }
        }
		
		// 단어가 존재하지 않으면:
		// “존재하지 않는 단어입니다.”라고 출력하세요.
        // 반복문을 다 돌았는데 단어 못 찾으면 여기에 도달
        System.out.println("존재하지 않는 단어입니다.");
		

	}

}
