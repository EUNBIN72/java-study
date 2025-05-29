package homework.homework1;

// 부모 클래스
public class Person {
	// 필드
	String name;
	private int age;
	private double height;
	private double weight;
	
	// 생성자
	public Person () {
		
	}
	
	public Person (int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
	public String toString() {
		return "===" + name + "===\n" + "나이 : " + age + "\n" + "키 : " +  height + "\n" + "몸무게 : " + weight;
		
	}

	
	//Getter()/Setter()
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	


}
