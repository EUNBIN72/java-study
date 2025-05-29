package homework.polymorphism.homework2;

public abstract class Menu {
	//필드
	private String name;
	private int price;
	
	
	//생성자
	Menu() {
		
	}
	
	Menu (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	//메소드
	// “메뉴명은 ”+name+”이고, 가격은 ”+price+”원입니다.”의 형식으로 문자열 만들어서 리턴 처리
	@Override
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "원입니다.";
	}
	
	// 추상 메소드로 구현
	public abstract void cook();
	
}
