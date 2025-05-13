package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// float(4byte), double(8byte)
		// 부동소수점 : 가수 * 10의 지수 제곱으로 표현
		// 부동소수점 방식으로 저장 => 같은 크기를 갖는 int(4byte), long(8byte) 보다 더 큰 수를 저장할 수 있음
		
		
//		float var1 = 3.14;  //자바 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석
		// double 타입을 float 타입에 바로 넣을 수 없음
		// F 또는 f 를 붙여 float 타입임을 알려줌
		float var2 = 3.14f;
		double var3 = 3.14;
		
		System.out.println(var2);   // 3.14
		System.out.println(var3);   // 3.14
		

		// 정밀도
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789f;   //주로 double을 사용
		
		System.out.println(var4);  //0.12345679 (9에서 반올림)
		System.out.println(var5);  //0.12345679104328156
		
		// e 사용하기
		// E 또는 e가 포함되어 있을 경우 => 실수 리터럴
		double var6 = 3e6;   //3.0 * 10^6;
//		int var = 3e6;  //double이 int 보다 더 큰 타입이므로 들어갈 수 없음
		float var7 = 3e6F;  
		double var8 = 2e-3;  // 2.0 * 10^-3
		
		System.out.println(var6);   //3000000.0
		System.out.println(var7);   //3000000.0
		System.out.println(var8);   // 0.002
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
