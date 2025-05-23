package sec06.homework06;

public class Rectangle {
	// 필드
	private int width = 1;
	private int height = 1;
	
	// 생성자
	public Rectangle(){
		
	}
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 메소드
	public int calculateRound () {
		return (width*2) + (height*2);
	}

	public int calculateArea () {
		return width * height;
	}

	public void printInfo() {
		System.out.println("===사각형 정보===");
		System.out.println("1. 사각형의 둘레 : " + calculateRound());
		System.out.println("2. 사각형의 둘레 : " + calculateArea());
		System.out.println();
	}
}
