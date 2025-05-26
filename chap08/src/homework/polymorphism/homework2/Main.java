package homework.polymorphism.homework2;

public class Main {
	public static void main(String[] args) {
		// Menu 타입의 객체 배열 크기 5로 생성
		Menu[] menu = new Menu[5];
		
		// 각 인덱스에 무작위로 Dish 또는 Drink 객체 생성
		// 이때, 매개변수 생성자를 이용하여 생성
		menu[0] = new Dish();
		menu[1] = new Drink();
		menu[2] = new Dish();
		menu[3] = new Drink();
		menu[4] = new Dish();
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터
		// 마지막 인덱스까지 객체의 cook() 메소드 호출
//		for (?)
		
	}

}
