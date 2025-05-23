package sec06.homework05;

public class Member {
	//필드
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자
	public Member() {  // 기본 생성자
		
	}
	
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println(memberName);
	}
	
	
	// 메소드
	
}
