package homework.homework1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3명의 학생 정보를 기록
		Student[] person = new Student[3];
		
		person[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		person[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		person[2] = new Student("홍길동", 1, 197.6, 86.0, 2, "물리학과");
		
		// 3명 학생 정보 출력
		for (Student p : person) {
			System.out.println(p.toString());
		} 
		
		
		// 최대 10명의 사원 정보 배열 
		Employee[] employeeList = new Employee[10];
		
		
		System.out.println("===사원 입력받기===");
		
		int count = 0;

		
		while(true) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("키 : ");
				double height = sc.nextDouble();
				System.out.print("몸무게 : ");
				double weight = sc.nextDouble();
				System.out.print("급여 : ");
				int salary = sc.nextInt();
				System.out.print("부서 : ");
				sc.nextLine(); // 버퍼 비우기
				String dept = sc.nextLine();
				
				
				// employeeList 객체에 입력 받은 내용들을 담아
				employeeList[count] = new Employee(name,age,height,weight,salary,dept);
				count++;
				
				// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가 
				// ‘n’일 경우 더 이상 그만 입력 받도록.. 
				String answer = "";
				System.out.print("계속 추가하시겠습니까? (Y/N 혹은 y/n)");
				answer = sc.nextLine(); // 스캐너로 받을 값

					
				if (answer.equalsIgnoreCase("Y")) {
					continue;
				} else if (answer.equalsIgnoreCase("N")) {
					break;
				}

				
		}
		
			// 배열에 담긴 사원들의 정보를 모두 출력
			for (int i = 0; i < employeeList.length; i++) {
				if (employeeList[i] == null) continue;
				System.out.println(employeeList[i].toString());
			}
			
			

	}

}
