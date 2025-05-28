package sec01.exam19;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);  // 0번 인덱스부터 6-1 인덱스까지 출력
		System.out.println(firstNum);
		
		String lastNum = ssn.substring(7);  // 7번 인덱스부터 끝까지 출력
		System.out.println(lastNum);
		
	}
}
