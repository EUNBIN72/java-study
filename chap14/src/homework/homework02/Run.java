package homework.homework02;

public class Run {
	public static void main(String[] args) {
		
	//Run 클래스에서 각 메소드 실행에 소요되는 시간을 출력하고, 비교하세요.
	
	String path = "C:/test/sub";
	Practice p = new Practice();
	
	long time1 = p.method1(path);
	System.out.println("method1 소요시간: " + time1 + "ns");
	
	long time2 = p.method2(path);
	System.out.println("method2 소요시간: " + time2 + "ns");
	System.out.println();
	
	
	 System.out.print("결과 비교: ");
     if (time1 < time2) {
         System.out.println("method1이 더 빠릅니다.");
     } else if (time2 < time1) {
         System.out.println("method2가 더 빠릅니다.");
     } else {
         System.out.println("두 메소드의 속도는 같습니다.");
     }

	}
	
	

}
