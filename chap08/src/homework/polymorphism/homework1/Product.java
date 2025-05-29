package homework.polymorphism.homework1;

//부모 클래스
public class Product {
	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Product() {
		
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	//getter()/setter()
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	//10% 할인된 금액 리턴
	public int calculatePrice() {
			return price * 90/100;
		}


	
	
	
	
	

}
