package homework.homework2;

public class Cake {
	// 필드
	private double flour;
	private double cream;
	
	
	// 기본 생성자
	Cake(){
		
	}
	
	// 매개변수 생성자
	Cake (double flour, double cream) {
		
	}
	
	
	// getter()/setter()
	public double getFlour() {
		return flour;
	}
	
	public void setFlour(double flour) {
		this.flour = flour;
	}
	
	public double getCream() {
		return cream;
	}
	
	public void setCream(double cream) {
		this.cream = cream;
	}
	
	
	
	@Override
	public String toString() {
		String result = "밀가루 : " + flour + "(g)\n";
		result += "크림 : " + cream + "(g)\n";
		return result;
	}

}
