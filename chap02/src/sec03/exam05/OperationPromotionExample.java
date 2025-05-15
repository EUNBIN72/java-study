package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;  // int + int로 바뀜
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		
		// char도 마찬가지(연산 시 int로 형변환)
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;  // int + int로 바뀜
		int intValue2 = charValue1 + charValue2;  
		System.out.println("유니코드: " + intValue2); // 66
		// 문자로 출력하고 싶다면 char 타입으로 강제 형변환
		System.out.println("출력문자: " + (char) intValue2);  // B
		
		// 정수 / 정수 = 정수
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;  // 정수 연산의 결과는 정수, 10 / 4 = 2
		System.out.println(intValue4);  // 2
		
		double doubleValue1 = intValue3 / 4;
		System.out.println(doubleValue1);  // 2.0
		
		// 실수 결과를 얻으려면 
		double doubleValue2 = intValue3 / 4.0;  // int / double 하면 double로 변환
		System.out.println(doubleValue2);  // 2.5
		
		// 정수 연산을 했는데 실수를 얻고싶을 때
		// 애초에 double로 선언을 해주면 double로 나옴
		int x = 1;
		int y = 2;
		double result = (double) x / y;  // x나 y중에 하나를 double 타입으로 바꿔줌
//		double result =  x / (double) y;  // 
//		double result = (double) x / (double) y;  
		System.out.println(result);  // 0.5
		
		
		
		
	}

}
