package sec01.homework.homework1;

public class Employee extends Person {
	// 필드
	private int salary;
	private String dept;
	
	// 생성자
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	
	public String toString() {
		return "이름 : " + "나이 : " + "키 : " + "몸무게 : " + "급여 : " + "부서 : " ;
		
	}

}
