package sec01.exam22;

public class StringValueOfExample {
	public static void main(String[] args) {
		// 기본 타입 값을 문자열로 변환
		String str1 = String.valueOf(10);  //int
		String str2 = String.valueOf(10.5);  //double
		String str3 = String.valueOf(true);  //boolean  
		
		
		// 전부 문자열로 바뀜
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// 문자열로 변환하는 간단한 방법
		// 빈 문자열을 더해줘서 문자열로 만들어줌
		String str11 = "" + 10;  //문자열 결합
		String str22 = "" + 10.5;  //문자열 결합
		String str33 = "" + true;  //문자열 결합
		
		
		System.out.println(str11);
		System.out.println(str22);
		System.out.println(str33);
	}
}
