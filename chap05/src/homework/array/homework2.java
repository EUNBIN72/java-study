package homework.array;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		//2. 값 입력 받아 배열 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int length = sc.nextInt(); 
		
		// 배열에 num 값 넣어줌
		int[] array = new int[length];
		
		
		for (int i = 0; i < length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			array[i] = sc.nextInt();
		}
		
		
		int sum = 0;
		// for each문 : array에서 num을 하나씩 꺼내
		for (int num : array) {
			System.out.print(num + " ");
			sum += num;
		}
		
		System.out.println("\n총 합: " + sum);
		
	}

}
