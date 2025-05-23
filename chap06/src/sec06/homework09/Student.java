package sec06.homework09;

public class Student {
	// 필드
	private static int studentnum;
	private String name;
	private String classroom;
	
	
	// 생성자
	Student() {
		studentnum++;
		
	}
	
	// 메소드
	public int getStudentnum() {
		return studentnum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getClassroom() {
		return classroom;
	}


	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	
	
	
	

	
	
	
	

}
