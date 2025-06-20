package library_project.project.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class BookStoreApplication {
	public static void main(String[] args) {
	
		// 평균 가격 계산
		// ArrayList<Book>에 객체 3개 추가
		ArrayList<Book> bookList = new ArrayList<Book>();
//		
//		bookList.add(new Novel("97*8937460449", 14000));
//		bookList.add(new Poem("9791193937655", 9000));
//		bookList.add(new Novel("9788937461798", 15000));
//		
//		
//		
//		// 전체 도서 정보 출력
//		for (Book book : bookList) {
//			book.printInfo();
//		}
//		System.out.println();
//		
//		// 총 평균 가격 출력(총 평균 가격: 12666.67 형태)
//		double sum = 0;
//		for (Book book : bookList) {
//			sum += book.getPrice();
//		}
//		
//		System.out.printf("총 평균 가격: " + "%.2f", sum/3);
//		
//		System.out.println();
//		
		
		// 사용자로부터 책 종류(소설/시) 입력 받기
		// 잘못된 종류 입력 시 예외처리 및 재입력 유도
		// ISBN 입력 받고 유효성 검사 (isValidISBN() 메소드 활용)
		// 가격 입력 받고 예외처리(NumberFormatException)
		// 입력 종료 조건(y/Y 입력 시) 처리
		// 입력 도서 목록 출력 및 평균 가격 계산
		
		//-----------------------------------------------------------
		// 사용자로부터 책 종류(소설/시) 입력 받기
		Scanner sc = new Scanner(System.in);
		while (true) {
			// 잘못된 종류 입력 시 예외처리 및 재입력 유도
			try {
				System.out.print("책 종류를 입력하세요 (소설/시): ");
				String bookType = sc.nextLine();
				if (!(bookType.equals("소설") || bookType.equals("시"))) {
					System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
					continue;
				}
				
				System.out.print("ISBN을 입력하세요 (13자리, *포함 가능): ");
				String isbnNum = sc.nextLine();
				
				
				
				
				System.out.print("가격을 입력하세요: ");
				int price = Integer.parseInt(sc.nextLine());
				
				bookList.add(new Novel(isbnNum, price));
				
				
				
				
				System.out.print("입력을 종료하시겠습니까? (y/Y 입력 시 종료): ");
				String exit = sc.nextLine();
				
				
				// 입력 종료 조건(y/Y 입력 시) 처리
				if (exit.equalsIgnoreCase("N")) {
					continue;
				} else if (exit.equalsIgnoreCase("Y")) {
					System.out.println("===== 도서 목록 =====");
					for (Book book : bookList) {
						book.printInfo();
					}
					double sum = 0;
					for (Book book : bookList) {
						sum += book.getPrice();
					}
					System.out.printf("총 평균 가격: " + "%.2f", sum/bookList.size());
					return;
				}
				
				
				
			} catch (NumberFormatException e) {
				System.out.println("다시 입력해주세요.");
				continue;
			} 
	
		
		}

	}
	
//	public static boolean isVaildISBN(String isbnNum) {
//		boolean result = true;
//		int count = 0;
//		
//		// 입력받은 isbnNum이 13자리수 이상이면
//		if(isbnNum.length() != 13) {
//			System.out.println("유효하지 않은 ISBN");
//		// 입력받은 isbnNum에서 *가 1개 이상일 때
//		} else if (isbnNum.) {
//			
//		}
//		
//		
//		
//	}
	
	
	
}

