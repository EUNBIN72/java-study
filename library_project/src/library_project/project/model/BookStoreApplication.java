package library_project.project.model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import library_project.project.controller.Book;
import library_project.project.controller.Novel;
import library_project.project.controller.Poem;


public class BookStoreApplication {
	public static void main(String[] args) {
	
		// 평균 가격 계산
		// ArrayList<Book>에 객체 3개 추가
//		ArrayList<Book> bookList = new ArrayList<Book>();
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
//		ArrayList<Book> bookList = new ArrayList<Book>();
//		Scanner sc = new Scanner(System.in);
//		
//		while (true) {
//			
//			while (true) {
//				// 잘못된 종류 입력 시 예외처리 및 재입력 유도
//				System.out.print("책 종류를 입력하세요 (소설/시): ");
//				String bookType = sc.nextLine();
//				if (!(bookType.equals("소설") || bookType.equals("시"))) {
//					System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
//					continue;
//				}
//				break;
//			}
//		
//			while (true) {
//					
//				System.out.print("ISBN을 입력하세요 (13자리, *포함 가능): ");
//				String isbnNum = sc.nextLine();
//				if (isVaildISBN(isbnNum)) {
//					continue;
//				}
//				break;
//			}	
//				
//				
//			// 
//			while (true) {
//				try {
//					System.out.print("가격을 입력하세요: ");
//					int price = Integer.parseInt(sc.nextLine());
//					
//				  // bookType에 따라 Novel 또는 Poem 객체 생성
//			        if (bookType.equals("소설")) {
//			            bookList.add(new Novel(isbnNum, price));
//			        } else {
//			            bookList.add(new Poem(isbnNum, price));
//			        }
//				} catch (Exception e) {
//					System.out.println("숫자를 입력해주세요");
//				}
//				
//			}	
//				
//				
//				System.out.print("입력을 종료하시겠습니까? (y/Y 입력 시 종료): ");
//				String exit = sc.nextLine();
//				
//				
//				// 입력 종료 조건(y/Y 입력 시) 처리
//				if (exit.equalsIgnoreCase("N")) {
//					continue;
//				} else if (exit.equalsIgnoreCase("Y")) {
//					System.out.println("===== 도서 목록 =====");
//					for (Book book : bookList) {
//						book.printInfo();
//					}
//					double sum = 0;
//					for (Book book : bookList) {
//						sum += book.getPrice();
//					}
//					System.out.printf("총 평균 가격: " + "%.2f", sum/bookList.size());
//					return;
//				}
//				
//				
//				
//			} 
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<>();

		while (true) {
		    try {
		        // 책 종류 입력
		        System.out.print("책 종류를 입력하세요 (소설/시): ");
		        String bookType = sc.nextLine();
		        if (!(bookType.equals("소설") || bookType.equals("시"))) {
		            System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
		            continue;
		        }

		        // ISBN 입력
		        System.out.print("ISBN을 입력하세요 (13자리, *포함 가능): ");
		        String isbnNum = sc.nextLine();

		        // 가격 입력
		        while (true) {
		            try {
		                System.out.print("가격을 입력하세요: ");
		                int price = Integer.parseInt(sc.nextLine());

		                if (bookType.equals("소설")) {
		                    bookList.add(new Novel(isbnNum, price));
		                } else {
		                    bookList.add(new Poem(isbnNum, price));
		                }

		                break; // 가격 입력 루프 탈출
		            } catch (NumberFormatException e) {
		                System.out.println("가격은 숫자로 입력해주세요.");
		            }
		        }


		        System.out.print("입력을 종료하시겠습니까? (y/Y 입력 시 종료): ");
		        String exit = sc.nextLine();
		        if (exit.equalsIgnoreCase("y")) break;

		    } catch (Exception e) {
		        System.out.println("오류 발생: " + e.getMessage());
		    }
		}

		// 도서 목록 출력
		System.out.println("\n===== 도서 목록 =====");
		double sum = 0;
		for (Book book : bookList) {
		    book.printInfo();
		    sum += book.getPrice();
		}
		System.out.printf("총 평균 가격: %.2f원%n", sum/bookList.size());

	
		
		}

	
	
	//isbn의 유효성 검사
	// 기준 : 13자리수이면서, 13자리수 중에 *이 두개이상 있으면 안됨
	public static boolean isVaildISBN(String isbnNum) {
		// isbnNum이 13자리가 아니면 true 리턴
		if (isbnNum.length()!=13) {
			System.out.println("유효하지 않는 ISBN입니다.");
			return true;
		}
		
		// '*' 개수 세기
		int starCount = 0;
		for (int i = 0; i < isbnNum.length(); i++) {
		    if (isbnNum.charAt(i) == '*') {
		        starCount++;
		    }
		}

		// '*'의 개수가 2개 이상이면 유효하지 않음
		if (starCount > 1) {
		    System.out.println("유효하지 않는 ISBN입니다");
		    return true;
		}
		
		return false;

			
	}
	
	
	
}

