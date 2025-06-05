package sec01.exam08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = {'A', 'B', 'C'};
		
		// 배열의 모든 문자를 출력
		writer.write(array);
		
		writer.flush();
	}
}
