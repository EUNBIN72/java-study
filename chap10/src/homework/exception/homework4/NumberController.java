package homework.exception.homework4;

import homework.exception.homework3.CharCheckException;

public class NumberController {
	
	public NumberController() {
		
	}
	
	public boolean checkDouble (int num1, int num2)  throws NumRangeException {
		// 매개변수로 들어온 두 값이 1~100 사이일때
		// num1이 num2의 배수이면 true
		// num1이 num2의 배수가 아니라면 false 반환
		// 1~100사이의 숫자가 아니라면
		// NumRangeException 발생
		// 에러 메시지는 출력 값 참고
		
		// 1~100 사이인지 확인 (둘 다 해당 범위여야 함)
	    if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
	        throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
	    }

	    // num1이 num2의 배수인지 확인
	    if (num1 % num2 == 0) {
	        return true;
	    } else {
	        return false;
	    }

		
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (c == ' ') throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
//			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
//				count++;
//			} 
//		}
//		return count;
//		
		
		
	}

}
