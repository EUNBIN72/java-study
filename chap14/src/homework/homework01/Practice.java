package homework.homework01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Practice {
	public void method1 (String str) {
		
		// FileOutputStream → 바이트 스트림 기반 출력 스트림
		// BufferedOutputStream → 내부에 버퍼를 둬서 입출력 속도 향상
		// str.getBytes() → 문자열을 바이트 배열로 변환
		// bos.write(...) → 데이터를 버퍼에 기록 (→ 자동적으로 파일에 기록됨)
		
		// FileOutputStream만 사용
		File file = new File("C:/test/sub");
		file.mkdirs();  // 디렉토리가 없으면 새로 파일 만들기
		try {
			FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야1.dat");
			byte[] byte1 = str.getBytes();  // 문자열을 byte 배열로 변환
			fos.write(byte1);  // 바이트 데이터를 파일에 기록
		} catch (Exception e) {
		}
	}
	
	public void method2(String str) throws Exception {
		// BufferedOutputStream을 함께 사용
		FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야2.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] byte2 = str.getBytes();
		bos.write(byte2);
	}


}
