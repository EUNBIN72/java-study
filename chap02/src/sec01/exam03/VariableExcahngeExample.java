package sec01.exam03;

public class VariableExcahngeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
//		y = x;  // x에 저장된 값을 변수 y에 저장(복사)
//		System.out.println("x:" + x + ", y:" + y);
		
		// x와 y의 값을 서로 교환. 즉, 바꾸고 싶다면
		// 임시 저장소 (temp)를 만들어주고 거기에 저장하고 꺼내옴
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
