package sec02.exam02;

public class ByteExample {

	public static void main(String[] args) {
		// byte(1byte)
		// 값의 범위 : -128 ~ 127
		
		 byte var1 = -128;
		 byte var2 = 0;
		 byte var3 = 127;
//		 byte var4 = 128;  // 범위를 벗어난 값을 저장하려고 하며 컴파일 에러 발생
		 
		 System.out.println(var1);  // -128
		 System.out.println(var2);  // 0
		 System.out.println(var3);  // 127
		 
		 System.out.println();
		 
		 // 참고 : 실행 중에 값의 범위를 벗어난 경우(순환)
		 byte var5 = 126;
		 System.out.println(var5);  // 126
		 var5++;
		 System.out.println(var5);  // 127
		 var5++;  // 오버플로우 발생(값이 넘침)
		 System.out.println(var5);  // -128 (값이 순환됨)
		 var5++;
		 System.out.println(var5);  // -127
		 
		 System.out.println();
		 
		 byte var6 = -127;
		 System.out.println(var6);  // -127
		 var6--;
		 System.out.println(var6);  // -128
		 var6--;  // 언더플로우 발생
		 System.out.println(var6);  // 127
		 var6--;
		 System.out.println(var6);  // 126
		 
	}

}
