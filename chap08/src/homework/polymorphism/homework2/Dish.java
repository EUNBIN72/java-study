package homework.polymorphism.homework2;

public class Dish extends Menu {
	//필드
	private String ingredients;
	
	//생성자
	public Dish() {
		
	}
	
	public Dish (String name, int price, String ingredients) {
		super(name, price);
		this.ingredients = ingredients;
	}

	//getter()/setter()
	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public void cook() {
		System.out.println(super.toString() + "재료는" + ingredients + "입니다.");
	}

}
