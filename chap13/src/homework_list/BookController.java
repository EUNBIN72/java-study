package homework_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BookController {
	// ArrayList 객체(BookList) 생성
	List<Book> bookList = new ArrayList<Book>();
	
	
	// 초기값 4개 추가
	public BookController() {
		bookList.add(new Book ("느리게 나이드는 습관","정희원","인문",16200));
		bookList.add(new Book ("코스모스","칼 세이건","자연과학",17910));
		bookList.add(new Book ("나에게 들려주는 예쁜 말","김종원","어린이",15610));
		bookList.add(new Book ("혼자 공부하는 자바","신용권","기타",25240));
		
	}
	
	
	// 새 도서 추가
	public void insertBook (Book bk) {
		// 전달 받은 bk를 bookList에 추가
		bookList.add(bk);
	}
	
	
	// 도서 전체 조회
	public List<Book> selectList() {
		// bookList 반환
		return bookList;
	}
	

	//도서 검색 조회
	public List<Book> searchBook (String keyword) {
		// 1. 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
		List<Book> searchList = new ArrayList<Book>();
		
//		List<Book> bookList = searchBook();
		
		// 2. 반복문을 통해 list의 책 이름 중에 전달받은 keyword 포함된 경우
		for (Book book : bookList) {
	        if (book.getTitle().contains(keyword)) {
	            searchList.add(book);
	        }
	    }
		return searchList;
	}
	
	
	// 도서 삭제
	public Book deleteBook (String title, String author) {
		// 1. 삭제된 도서를 담을 객체(Book removeBook) 선언 및 null 할당
		// null 할당???
		Book removeBook = null;
		
		// 2. 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고
        // 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
		 for(Book book : bookList) {
	        	if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
	        		removeBook = book;
	        		bookList.remove(book);
	        		break;
	        	}
	        }
	    return removeBook; // 삭제할 책이 없음
		
		
	}
	
//	 도서 오름차순 정렬
	public int ascBook() {
		// Collections.sort와 Comparable활용
	    // 책 이름 기준으로 오름차순 정렬 후 1 반환
		Collections.sort(bookList);
		
		return 1;
		
	    }
	
	
}
