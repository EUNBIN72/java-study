package library_project.project.controller;

public class Book {
	// 필드 선언
	private String isbn;
	private int price;
	
	// 기본 생성자 및 매개변수 생성자 정의
	public Book() {
		
	}
	
	public Book(String isbn, int price) {
		this.isbn = isbn;
		this.price = price;
	}
	
	
	// private 선언으로 인한 getter()/setter()
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// printInfo() 메소드 정의(ISBN, 가격 출력)
	public void printInfo() {
		System.out.println("ISBN: " + isbn + ", 가격: " + price + "원");
	}
	

	// recoverMissingDigit() 메소드 정의(손상된 ISBN 복구 알고리즘 포함)
	public void recoverMissingDigit() {
		
		
	}
	

}
