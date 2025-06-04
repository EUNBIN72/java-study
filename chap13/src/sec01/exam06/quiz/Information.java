package sec01.exam06.quiz;

public class Information {
	// 필드
	private String phone;
	private int salary;
	
	// 생성자
	public Information() {
		
	}

	public Information(String phone, int salary) {
		this.phone = phone;
		this.salary = salary;
	}

	// getter()/setter()
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	// toString() 재정의
	@Override
	public String toString() {
		return "[전화번호" + phone + ", 월급" + salary + "]";
	}

}
