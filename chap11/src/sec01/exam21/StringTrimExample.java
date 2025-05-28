package sec01.exam21;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		// 공백을 제거하고 이어서 출력
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
