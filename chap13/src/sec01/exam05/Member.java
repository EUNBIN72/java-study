package sec01.exam05;

import java.util.Objects;

public class Member implements Comparable<Member> {
	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Getter()
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Member)) return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	// toString()
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Member o) {
		return age - o.age;
	}
	
	
	
}
