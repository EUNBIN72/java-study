package sec02.exam10;

public class AdvanedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수의 총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 점수: " + avg);
		
		
		// 정리 :
		// 기본 for문 보다 코드가 간결하여 자주 쓰임
		// 배열 index 값의 사용이 필요할 때는 기본 for문 사용
  
	}

}
