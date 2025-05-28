package homework.homework4;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 4. 반복 멈춰!!
		
		// 사용자로부터 문자를 반복해서 입력받아
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		
		while (true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
		// 입력받은 문자가 n 또는 N이 되면 프로그램을 종료	
		// 이때, 조건식에 논리연산자(&& 혹은 ||)를 사용할 수 없어
		// n또는 N이 아니면 result에 지금까지의 문자열을 담아
			if (!(str.equalsIgnoreCase("n"))) {
				result += str;
			} else {
				break;
			}
		}	
		
		
			// 프로그램을 종료함과 동시에 지금까지 입력한 문자를 출력
			System.out.println("프로그램을 종료합니다.");
			System.out.println("최종 문자열 : " + result);
		}
		

		

	}


