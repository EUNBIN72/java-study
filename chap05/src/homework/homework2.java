package homework;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt(); 
		
		int[] array = new int[num];
		
		
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("입력받은 숫자 : " + array[num]);
		
		System.out.println("총 합: " + sum);
		
	}

}
