package homework.homework5;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 5. 암호 생성기
		
		// 사용자로부터 이름과 생년월일을 입력받으세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		
		//입력받은 이름과 생년월일을 활용하여 아래 규칙에 따라 암호를 생성하세요.
		    //이름에서 첫글자를 추출합니다.
		    // 생년월일에서 연도와 일을 추출합니다.
		    // 이름의 첫글자+연도끝두자리+일+나머지 이름 형식으로 암호를 만들어주세요
		
		char firName = name.charAt(0);
		String yBirth = birth.substring(2, 4);
		String mBirth = birth.substring(6);
		
		// name을 String 타입으로 바꿔주고 첫 글자를 뺀 문자열을 반환
		String lName = String.valueOf(name);
		String llName = lName.substring(1);

		
		
				
		System.out.println(firName + yBirth + mBirth + llName);

	}
	
}
