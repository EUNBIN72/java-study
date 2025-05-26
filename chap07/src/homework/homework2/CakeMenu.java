package homework.homework2;

import java.util.Scanner;

public class CakeMenu {
	
	Scanner sc = new Scanner(System.in);
	
	ChocolateController cc = new ChocolateController();
	GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		System.out.println("====어떤 케이크를 만드시겠습니까?====");
		System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)" );
		System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
		System.out.println("9. 취소");
		System.out.println("메뉴 번호 : ");
	}
	
	public void chocolateMenu() {
		
	}
	
	public void greenTeaMenu() {
		
	}

}
