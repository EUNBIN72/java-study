package sec01.exam20;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));  //false(대소문자 구분함)
		
		// 대소문자 상관없이 비교하고 싶을 때
		// 모두 소문자나 대문자로 바꿔놓고 비교
		String lowerStr1 = str1.toLowerCase();  
		String lowerStr2 = str2.toLowerCase();  
		System.out.println(lowerStr1);  //java programing
		System.out.println(lowerStr2);  //java programing
		System.out.println(lowerStr1.equals(lowerStr2));  //true
		
		// 다른 방법
		// 대소문자 관계없이 문자열만 비교해줌
		System.out.println(str1.equalsIgnoreCase(str2));  //true
		
	}

}
