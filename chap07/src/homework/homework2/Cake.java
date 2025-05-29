package homework.homework2;

public class Cake {
	// 필드
	private double flour;  //밀가루
	private double cream;  //크림
	
	
	// 기본 생성자
	Cake() {
		
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
	
	
	// 밀가루랑 크림 출력
	@Override
	public String toString() {
		String result = "밀가루 : " + flour + "(g)\n";
		result += "크림 : " + cream + "(g)\n";
		return result;
	}

}
