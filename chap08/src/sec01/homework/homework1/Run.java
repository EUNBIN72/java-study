package sec01.homework.homework1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Student[] person = new Student[3];
		
		person[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		person[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		person[2] = new Student("홍길동", 1, 197.6, 86.0, 2, "물리학과");
		
		for (Student p : person) {
			System.out.println(p.toString());
		} 
		
		Employee[] em = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===사원 입력받기===");
		
		
		while(true) {
			System.out.println("이름 : ");
			sc.nextLine();
			System.out.println("나이 : ");
			sc.nextInt();
			System.out.println("키 : ");
			sc.nextDouble();
			System.out.println("몸무게 : ");
			sc.nextDouble();
			System.out.println("급여 : ");
			sc.nextInt();
			System.out.println("부서 : ");
			sc.nextLine();
			
		}
		

	}

}
