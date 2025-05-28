package homework.homework3;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// 3. 유효성 검사
		
		// 사용자로부터 이메일 주소를 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 주소를 입력하세요. :");
		String address = sc.nextLine();
		
		
		// 입력받은 이메일에 앞뒤 공백을 제거
		//trim?
		String email = address.trim();
//		System.out.println(email);
		
		// 이메일이 @goodee.co.kr로 끝나는지 확인
		//equals
		// 추출해서 뒤에서 13 부터가 맞는지 검사해
		
		String target = "@goodee.co.kr";
		
		if (email.contains(target)) {
			String[] newEmail = email.split("@");
			String upperid = newEmail[0].toUpperCase();
			System.out.println(upperid);
		} else {
			System.out.println("유효하지 않은 이메일입니다.");
			
		}
		
		
	
		//이메일이 @goodee.co.kr로 끝나는지 확인
		//만일 @뒤에 글자가 위와 다를 경우 “유효하지 않은 이메일입니다.”를 출력
		//if문 쓸거임?
		//유효한 이메일이라면, 아이디(@앞부분)을 추출하면 대문자로 변환한 뒤 출력
		

	}

	
}
