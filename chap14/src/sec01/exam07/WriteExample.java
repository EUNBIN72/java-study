package sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test7.txt 파일로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer =new FileWriter("C:/Temp/test7.txt");
	}

}
