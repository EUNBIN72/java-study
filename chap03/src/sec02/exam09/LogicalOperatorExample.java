package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';  // 65
		System.out.println(charCode);
		
		if ((charCode >= 65) & (charCode <= 90)) {  // true & true
			System.out.println("대문자이군요");			
		} 
		
		if ((charCode >= 97) && (charCode <= 122)) {  // false && => false (short-circuit 동작)
			System.out.println("소문자이군요");			
		} 
		
		if (!(charCode < 48) && !(charCode > 57)) {  // true && => false 
			System.out.println("0~9 숫자군요");			
		} 
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) {  //true | true => true(뒤에 로직까지 검사)
			System.out.println("2 또는 3의 배수군요");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {  // true || => true (short-circuit 동작)
			System.out.println("2 또는 3의 배수군요");
		}
		
		// 정리 : 연산의 결과를 같은데 효율성(속도)이 더 높으므로 &&, ||를 사용
		
		
		// 비교 연산자 (& 나  |)를 한번 쓰게 되면 비교 대상 모두를 평가해서 결과를 산출
		// && 나 || 를 쓰게 되면 (short-circuit 동작)하여 뒤의 피연산자를 평가하지 않고 바로 결과를 산출
		// 따라서, &&나 || 가 더 효율적으로 동작함
	}

}
