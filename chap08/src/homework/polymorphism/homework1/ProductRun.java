package homework.polymorphism.homework1;

public class ProductRun {

	public static void main(String[] args) {
	// Product 타입의 참조변수를 2개 생성
	Product p1;
	Product p2;
	
	// Food와 Book의 매개변수가 있는 생성자로 참조변수에 할당
	p1 = new Food("치킨", 2000, 3);
	p2 = new Food("자바의 정석", 15000, 0);
	
	
	//2개의 할인된 금액을 계산
	int dcPrice1 = p1.calculatePrice();
	int dcPrice2 = p2.calculatePrice();
	
	//상품의 최종가격 출력
	System.out.println("치킨의 최종 가격 : " + dcPrice1);
	System.out.println("자바의 정석의 최종 가격 : " + dcPrice2);
	
	}

}
