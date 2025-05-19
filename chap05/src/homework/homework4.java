package homework;

public class homework4 {
	
	public static void main(String[] args) {
		// 4. 로또 번호 자동 생성기
		
		// 중복 없는 6개의 랜덤 값 출력
		int[] num = new int[6];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 +1);
			
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
			
		}
		for (int i = 0; i < num.length; i++ ) {
			for (int j = 0; j < num.length-1-i; j++) {
				if (num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
			System.out.print(num[i] +  " ");
		}
		

	
	}

}
