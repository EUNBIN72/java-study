package homework.homework1;

public class Person {

	//필드
	private String name;
	private int age;
	private String address;
	private char gender;
	
	public Person() {
		
	}
	
	public Person (String name, int age, String address, char gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}
	
	// 리턴값으로 출력할 형태를 작성해서 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
	

	
}
