package homework.array;

import java.util.Arrays;
import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		// 6. 배열 늘리기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt(); 
		//개행 문자 제거
		sc.nextLine();

		// String 타입의 배열을 num만큼 생성
		String[] array = new String[num];

		// 배열의 크기만큼 돌아감
		for (int i = 0; i < num; i++) {
			System.out.print((i+1) + "번째 문자열: ");
			sc.nextLine();
		}
		
		while (true) {
			System.out.println("배열에 값을 추가하시겠습니까? (Y/N): ");
			String anser = sc.nextLine();
			
			if(anser.equals("Y")) {
				System.out.println("더 입력하고 싶은 개수: ");
				int add = sc.nextInt();
				
				// 새 배열 생성
				String[] newArray = new String[array.length + add];
				
				// 배열 복사
				newArray = Arrays.copyOf(array, array.length + add);
				
				
				
//				// 배열 복사
//				for (int i = 0; i < array.length; i ++) {
//					newArray[i] = array[i];
//				}
//				
				// 새 값 입력받아
				 for (int i = array.length; i < newArray.length; i++) {
	                    System.out.print((i + 1) + "번째 문자열을 입력하세요: ");
	                    newArray[i] = sc.nextLine();
	                }
				 array = newArray;
				
				
			}
//			else if (choice.equals("N")) {
//				System.out.println(newArray[i]);
//			}
			
			
		}
	


	}

}
