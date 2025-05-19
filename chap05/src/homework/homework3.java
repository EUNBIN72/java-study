package homework;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		// 3. 올라갔다 내려갔다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3 이상의 홀수(정수)를 입력받으세요.");
		
		while (true) {
			System.out.print("정수 : ");
			
			int num = sc.nextInt();
			int count = 0;
			
			if ((num >= 3) && (num % 2 != 0)) {
				int[] arr = new int[num];
				
				for (int i = 0; i <arr.length; i++) {
					if (i <= arr.length / 2) {
						arr[i] = ++count;
					} else {
						arr[i] = --count;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				break;
	
			} else {
				System.out.println("다시 입력하세요.");
			}	
		}
		
	}
}
