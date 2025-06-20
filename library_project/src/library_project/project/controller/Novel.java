package library_project.project.controller;

public class Novel extends Book {
	
	public Novel(String isbn, int price) {
		super(isbn, price);
	}
	
	@Override
	public void printInfo() {
		System.out.print("[소설] ");
		super.printInfo();
	}
}
