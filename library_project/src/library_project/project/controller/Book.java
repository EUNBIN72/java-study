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
		System.out.println("ISBN: " + getIsbn() + ", 가격: " + getPrice() + "원");
	}
	

	// recoverMissingDigit() 메소드 정의(손상된 ISBN 복구 알고리즘 포함)
	public void recoverMissingDigit() {
		// isbn은 전세계 모든 도서에 부여된 고유 번호임
		// isbn은 총 13자리의 숫자로 표현
		// 만일 13자리의 숫자를 abcdefghijklm이라고 할 때, 마지막 자리의 값 m을 체크기호라고 부름
		//체크 기호는 아래의 공식이 성립되어야 함
		//앞에서부터 각 자리마다 가중치 1,3,1,3…을 순서대로 곱한 것을 모두 더하고 그값을 10으로 나눈 나머지가 0이 되어야 함
		// a+3b+c+3d+e+3f+g+3h+i+3j+k+3l+m ≡ 0 (mod 10)
		// 주어진 isbn 중 일부 책은 중간 숫자 하나가 *로 손상되어 있음
		// 해당 메소드를 통해 만일 isbn이 손상된 경우 * 위치의 올바른 숫자를 찾아 isbn 수정
		
//		13자리가 아닌 ISBN은 입력 거부
//		[ ] *이 여러 개 있을 경우 입력 거부
//		[ ] *이 1개 있을 경우 복구 시도 및 체크식 통과 확인
//		[ ] 유효하지 않은 경우 "유효하지 않은 ISBN입니다" 출력

	
		int count = 0;
		int index = -1;
		
		
		// '*' 의 개수 확인 및 위치
		for (int i = 0; i < 13; i++) {
			// String 타입을 char 타입으로 변환하기 위해 charAt() : 문자열에서 원하는 문자 하나만 가져오고 싶을 때
			if (isbn.charAt(i) == '*') {
				count++;
				index = i;
			}
		}
		
		 // 유효성 검사: '*'는 하나만 있어야 복구 가능
//	    if (count != 1) {
//	        System.out.println("'*'은 2개 이상일 수 없습니다.");
//	        return;
//	    }
		
		// 복구
		// '*'을 확인한 위치가 홀수 즉, (1번째, 3번째, 5번째...)이면 1을 곱해주고
		// '*'의 위치가 짝수 즉, (2번째, 4번째, 6번째 ...)이면 3을 곱해줌		
		int sum = 0;
		
		for (int i = 0; i < 13; i++) {
			if (i == index) {
				continue;
			}
			char ch = isbn.charAt(i);
			int num = ch - '0';
			sum += (i % 2 == 0) ? num : num * 3;
		}
		
		// 자리수마다 곱해준 값을 모두 더하고 그 값을 10으로 나눈 나머지마 0이 되어야 함
		// 이러한 공식으로 *의  수를 알아내어 isbn 코드를 알아냄
		
		// '*' 위치에 들어갈 숫자 찾기(숫자의 범위는 0 ~ 9)
		for (int starLocation = 0; starLocation <= 9; starLocation++) {
			int total = sum + ((index % 2 == 0) ? starLocation : starLocation*3);
			if(total % 10 == 0) {
				StringBuilder recoverISBN = new StringBuilder(isbn);
				System.out.println(recoverISBN.toString());
				return;
			}
		}
	
		
		// '*' 의 개수 확인 및 위치를 확인
		// '*'을 확인한 위치가 홀수 즉, (1번째, 3번째, 5번째...)이면 1을 곱해주고
		// '*'의 위치가 짝수 즉, (2번째, 4번째, 6번째 ...)이면 3을 곱해줌
		// 그 순서대로 곱한 것을 모두 더하고 그 값을 10으로 나눈 나머지가 0이 되어야됨
		// 그렇게 하여 *의 값을 알아낼 수 있음
	}
	

}
