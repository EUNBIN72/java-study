package homework_set;

import java.util.Objects;

public class Lottery implements Comparable<Lottery> {
	// 필드
	private String name;
	private String phone;
	
	
	// 생성자
	public Lottery() {
		
	}

	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}


	// getter()/setter()
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	// toString()
	@Override
	public String toString() {
		return "[이름=" + name + ", 휴대폰 번호=" + phone + "]";
	}

	// 해시코드 재정의
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	// equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Lottery)) return false;
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	

	@Override
	public int compareTo(Lottery l) {
		int nameCompare = this.name.compareTo(l.name);
		if (nameCompare != 0) return nameCompare;
		return this.phone.compareTo(l.phone);
	}
	

	
	
	
}
