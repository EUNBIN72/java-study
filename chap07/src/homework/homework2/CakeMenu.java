package homework.homework2;

import java.util.Scanner;

public class CakeMenu {

	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	// 메인 질문 출력
	public void mainMenu() {
		while (true) {
			System.out.println("==== 어떤 케이크를 만드시겠습니까? ====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
			System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			//1을 입력하면 chocolateMenu() 실행
			if (choice == 1) chocolateMenu();
			//2를 입력하면 greenTeaMenu() 실행
			else if (choice == 2) greenTeaMenu();
			//9를 입력하면 종료문 출력
			else if (choice == 9) {
				System.out.println("종료합니다.");
				break;
			}
			//1, 2, 9 외에 다른 번호를 입력했을 때 출력
			else System.out.println("잘못된 번호입니다.");
		}
	}
	
	// 초콜릿 메뉴를 받아 
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		System.out.println(cc.bakeChocolateCake(flour, cream, cherry, chip));
	}
	
	// 녹차 메뉴를 받아
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("녹차 파우더(g) : ");
		double powder = sc.nextDouble();
		System.out.print("치즈 큐브(개) : ");
		int cheese = sc.nextInt();
		System.out.println(gtc.bakeGreenTeaCake(flour, cream, powder, cheese));
	}
	
	
	
	
}