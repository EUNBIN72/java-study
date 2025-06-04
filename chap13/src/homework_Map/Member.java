package homework_Map;

public class Member {
	// 필드
	private String password;
	private String name;
	
	// 생성자
	public Member() {
		
	}

	public Member(String password, String name) {
		this.password = password;
		this.name = name;
	}

	// getter()/setter()
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString() 재정의
	@Override
	public String toString() {
		return "Member [password=" + password + ", name=" + name + "]";
	}
	
	
	
	
 
}
