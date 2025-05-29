package homework.homework1;

// 자식 클래스
public class Student extends Person {
	// 필드
	private int grade;
	private String major;
	
	// 생성자
	public Student() {
		
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + "\n학년 : " + grade + "\n" + "전공 : " + major;
		
	}

	

	}
	
	


