package homework_list;

import java.util.List;
import java.lang.ModuleLayer.Controller;
import java.util.Scanner;

import homework_list.*;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	
	BookController bc = new BookController();
	
	
	public void mainMenu() {
		while (true) {
		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
		System.out.println("원하시는 업무의 번호를 선택하세요.");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 선택 : ");
		
		int num = sc.nextInt();
		sc.nextLine();  // 버퍼 클리어
		
			switch (num) {
	        case 1:
	            insertBook();
	            break;
	        case 2:
	            selectList();
	            break;
	        case 3:
	            searchBook();
	            break;
	        case 4:
	            deleteBook();
	            break;
	        case 5:
	            ascBook();
	            break;
	        case 9:
	            System.out.println("프로그램을 종료합니다.");
	            return; // 또는 break + while 탈출
            default:
            	System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
	            break;
			}
		 }
	}
	
	
	public void insertBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("장르(1: 인문, 2: 자연과학, 3: 어린이, 그 외: 기타) : ");
		int category = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();  // 버퍼 클리어
		
		
		// 5. 매개변수 생성자를 이용하여 Book 객체 생성 
		
		
		// 장르명 입력은 숫자로 받지만 객체 생성할때는 문자열로 넘기기
        // (1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타)
		 String categoryStr;
		    switch (category) {
		        case 1:
		        	categoryStr = "인문";
		            break;
		        case 2:
		        	categoryStr = "자연과학";
		            break;
		        case 3:
		        	categoryStr = "어린이";
		            break;
		        default:
		        	categoryStr = "기타";
		    }
		    
		    
	    Book book = new Book(title, author, categoryStr, price);
	    bc.bookList.add(book);
		 // 6. BookController의 insert로 Book 객체 전달
//	    Book book = new Book(title, author, categoryStr, price);
	}
	
	
	
	public void selectList() { 
		// 1. BookController의 selectList 메소드 호출
		// -> 결과값을 임의의 리스트 bookList생성하여 대입
		// 2. BookControllr의 searchBook 메소드로 위의 keyword 전달
        // -> 결과 값을 임의의 리스트 searchList를 생성후 대입
        // -> 키워드가 완전한 도서명이 아니라 도서명의 일부 일 수 있고
        // 일부 키워드를 입력한 경우 해당 키워드를 포함하는 여러 개의 도서 조회됨
        // 단일 객체가 아니라 리스트로 조회
        // 3. 조건식 이용
        // 3-1. searchList가 비어 있는 경우
        // -> "검색 결과가 없습니다."라는 문구 출력
        // 3-2. searchList가 비어 있지 않은 경우
        // -> 반복문으로 searchList 안의 Book 객체 출력
		System.out.println("==전체 조회==");
		
		 List<Book> bookList = bc.selectList();
		 
		 
		 if (bookList.isEmpty()) {
			 System.out.println("존재하는 도서가 없습니다.");
		 } else {
			// -> 반복문을 통해 bookList안의 Book 객체들 출력
			 for (Book b : bookList) {
				System.out.println(b);
			}
		 }
		 
	}
	
	
	
	public void searchBook() {
		// 1. 검색할 도서명 키워드 입력 받기(String keyword)
		System.out.println("==도서 검색==");
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		// 2. BookControllr의 searchBook 메소드로 위의 keyword 전달
		// -> 결과 값을 임의의 리스트 searchList를 생성후 대입
        // -> 키워드가 완전한 도서명이 아니라 도서명의 일부 일 수 있고
        // 일부 키워드를 입력한 경우 해당 키워드를 포함하는 여러 개의 도서 조회됨
        // 단일 객체가 아니라 리스트로 조회
		List<Book> searchList = bc.searchBook(keyword);

		
		if (bc.searchBook(keyword).isEmpty()) {
	        System.out.println("존재하는 도서가 없습니다.");
	    } else {
	        for (Book book : bc.searchBook(keyword)) {
	            System.out.println("검색한 도서 목록: " + book);  // toString() 메서드 필요
	        }
	    }
		
	}
	
	
	
	public void deleteBook() {
		// 1. 삭제할 도서명 입력 받기 (String title)
        // 2. 삭제할 저자명 입력 받기 (String author)
		System.out.println("==도서 삭제==");
		System.out.print("삭제할 도서명: ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		// -> 같은 도서명을 가졌지만 저자명이 다른 경우
        // 다른 도서명을 가졌지만 저자명이 같은 경우도 있을 수 있음
		//???
		
	    // 3. searchList에 해당 책 추가
//		BookController controller = new BookController();
		Book removedBook = bc.deleteBook(title, author);
		
		
        // 4. searchList 반환
		  if (removedBook != null) {
		        // 4-1. 삭제 성공
		        System.out.println("성공적으로 삭제되었습니다: " + removedBook);
		    } else {
		        // 4-2. 삭제 실패
		        System.out.println("삭제할 도서를 찾지 못했습니다.");
		    }
		
	}
	
	
	
	public void ascBook() {
        // 1. BookController의 ascBook() 메소드 호출
        int result = bc.ascBook();

        // 2. 메소드 호출 결과가 1이면 성공, 그 외 실패
        if (result == 1) {
            System.out.println("정렬에 성공하였습니다.");
    
            selectList();  // 정렬 후 전체 목록 출력
        } else {
            System.out.println("정렬에 실패하였습니다.");
        }
	}
}
