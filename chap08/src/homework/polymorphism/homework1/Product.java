package homework.polymorphism.homework1;

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


	public int calculatePrice() {
			return price * 10/100;
		}


	
	
	
	
	

}
