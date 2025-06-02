package homework_set;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LotteryMenu {
	// Scanner 객체 생성
	// LotteryController 객체 생성 
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		// 1. 사용자가 메인메뉴 선택
		// 2. 종료 전까지 반복 실행
		// 3. 각 메뉴 번호 입력시 해당 메소드로 이동
		// 4. 잘못된 번호 입력시
		// -> "잘못 입력하였습니다. 다시 입력해주세요." 출력 후 반복
		while (true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			
			
			int num = sc.nextInt();
			sc.nextLine();  // 버퍼 클리어
			
				switch (num) {
		        case 1:
		        	insertObject();
		            break;
		        case 2:
		        	deleteObject();
		            break;
		        case 3:
		        	searchObject();
		            break;
		        case 4:
		        	winObject();
		            break;
		        case 5:
		        	sortedWinObject();
		            break;
		        case 6:
		        	serchWinner();
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
	
	// 1. 추첨 대상 추가용 view 메소드
	public void insertObject() {
		// 1. 추가할 추첨 대상 수를 입력 받음
		System.out.print("추가할 추첨 대상 수: ");
		int countNum = sc.nextInt();
		
		int count = 0;
		sc.nextLine();  // 버퍼 클리어
		while (count < countNum) {
			// 2. 입력 받은 수만큼 추첨자 이름과 핸드폰 번호 입력 받음
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰 번호(-빼고) : ");
		String phone = sc.nextLine();
		
		// 3. 매개변수 생성자를 이용해서 Lottery 객체에 추첨자 정보 저장
		Lottery lotto = new Lottery(name, phone);
		
		
		// 4. Lottery 객체를 lc의 insertObject 메소드로 전달
		// * 중복된 추첨 대상인 경우
		// -> "중복된 대상입니다. 다시 입력하세요." 출력
		// -> 이어서 다시 객체 입력하도록 해줌
		// 5. 모든 입력이 완료되면 "n 명추가 완료되었습니다." 출력
		boolean dup = lc.insertObject(lotto);
		
			if (dup) {
				count++;
			} else {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			}
		}
		System.out.println(countNum + "명 추가 완료되었습니다.");
		
			
	}
	
	// 2. 추첨 대상 삭제용 view 메소드
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		// 1. 삭제할 대상의 이름과 휴대폰 번호 입력 받음
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰 번호(-빼고) : ");
		String phone = sc.nextLine();
		
		// 2. 매개변수 있는 Lottery 생성자를 이용해 객체 구성
		Lottery toDelete = new Lottery(name, phone);
		
		// 3. lc에 있는 deleteObject에 전달
		boolean result = lc.deleteObject(toDelete);
		
		// 4. 전달받은 값 true면 "삭제 완료되었습니다."
		// 5. false면 "존재하지 않는 대상입니다." 출력
		if (result) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
		
		
	}
	
	// 3. 추첨 대상 목록 조회 view 메소드
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		
		// lc에 있는 searchObject에게 
		// 당첨 가능성이 있는 대상(추첨 대상) 목록 조회 요청
		Set<Lottery> lotteryList = lc.searchObject();
		
		for (Lottery lottery : lotteryList) {
			System.out.println(lottery);
		}
		
	}
	
	// 4. 당첨 대상 확인용 view 메소드
	public void winObject() {
		// lc에서 받아온 Set 객체를 표준 출력
		// lc의 winObject 리턴값이 null이면 
		// "추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다."출력
//		Set<Lottery> 
		
	}
	
	// 5. 정렬된 당첨 대상 확인
	public void sortedWinObject() {
		// 1. 이름을 오름차순으로 정렬
		// 이름이 같으면 번호로 오름차순 정렬
		// 정렬의 결과를 반환
		// 이때, 미리 만들어진 win을 가지고 정렬
			
		}
	
	// 6. 당첨 대상 검색용 view 메소드
	public void serchWinner() {
		
	}
	
	
}
