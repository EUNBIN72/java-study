package sec02.exam04.quiz;

// Animal 추상 클래스
public abstract class Animal {
	
	// 필드
	private String kind;
	private int leg;
	
	// 생성자
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}

	// 추상 메소드 eat(); , sound();
	// 추상 메소드: {}(구현부)가 없는 거
	public abstract void eat();
	public abstract void sound();
	
	
	//getter
	public String getKind() {
		return kind;
	}

	public int getLeg() {
		return leg;
	}


	

}
