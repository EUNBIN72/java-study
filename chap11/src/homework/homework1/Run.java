package homework.homework1;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		
		
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		// 위 문자열을 \n을 기준으로 3개의 문자열로 나누세요
		String[] pLine = str.split("\n");
		
		// 나눈 pLine 문자열을 Person이라는 객체에 담아
		Person[] people = new Person[pLine.length];
		
		// Person이라는 객체에 담은 문자열을
		// ,를 기준으로 값을 잘라서 객체를 생성
		for(int i = 0; i < pLine.length; i++) {
			String[] per = pLine[i].split(",");
			// 이때 타입을 맞춰줘야 됨 
			// String 타입을 받았으니가 int는 Integer.parseInt()로 타입 변환, char는 charAt()으로 문자를 가져와
			// 각 배열에 맞게 담아줌
			String name = per[0];
			int age = Integer.parseInt(per[1]);
			String address = per[2];
			char gender = per[3].charAt(0);
			
			// people이라는 객체에 가져온 값들을 담아
			people[i] = new Person(name, age, address, gender);
			
		}
		
			// 만들어진 3개의 객체를 toString()을 통해 출력
			for (Person p1 : people) {
	            System.out.println(p1.toString());
	        }
		
		
		

		
	}

}
