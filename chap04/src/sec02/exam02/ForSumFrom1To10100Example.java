package sec02.exam02;

public class ForSumFrom1To10100Example {

	
	public static void main(String[] args) {
		// 1부터 100까지의 합 출력
		int sum = 0; // sum을 0으로 초기화
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합: " + sum);
	}
}
