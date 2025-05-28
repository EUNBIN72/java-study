package sec01.exam18;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "Java");  
		// "자바"라는 문자열을 "JAVA"로 바꿔주는데 새로운 문자열임
		// 원본 객체는 변경되지 않음(수정되지 않는 객체임)
		
		System.out.println(oldStr); // 원본 변경 안됨
		System.out.println(newStr); // 새로운 객체

	}

}
