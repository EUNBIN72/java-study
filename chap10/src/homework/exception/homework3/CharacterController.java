package homework.exception.homework3;

import sec02.exam06.InvalidAgeException;

public class CharacterController {
	
	//기본 생성자
	CharacterController () {
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				count++;
			} 
		}
		return count;
		
		
		
		
		

	} 


}
