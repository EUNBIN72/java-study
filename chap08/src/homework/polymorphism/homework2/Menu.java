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
	@Override
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "원입니다.";
	}
	
	public abstract void cook();
}
