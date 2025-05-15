package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// 2. 인테리어하면 철수
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("방의 가로 길이를 입력하세요: ");
		double horizontal = scanner.nextDouble();
		
		System.out.println("방의 세로 길이를 입력하세요: ");
		double vertical = scanner.nextDouble();
		
		double area = horizontal * vertical;
		double circumference = (horizontal + vertical) * 2;
		
		System.out.println("방의 면적은: " + area);
		System.out.println("방의 둘레는: " + circumference);

	}

}
