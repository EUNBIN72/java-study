package homework.homework02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Practice {
	public long method1 (String str){
		
		// BufferedReader는 내부적으로 버퍼를 사용하여 입출력 성능을 향상 시킴
		// InputStreamReader와 함께 사용하여 바이트 -> 문자로 변환
		// char[] 버퍼를 이용해 한번에 많은 문자를 읽음
		// BufferedReader를 사용하면 파일 입출력 속도가 더 빠르며 효율적
		
		
		long start = System.nanoTime();  // 시작 시간 측정
	    char[] data = new char[10000];  // 데이터를 임시로 저장할 버퍼
	    
	    try (FileInputStream is = new FileInputStream(str + "\\나비야1.dat");
	         Reader reader = new InputStreamReader(is)) {
	        
	    } catch (IOException e) {
	        e.printStackTrace();  //예외 발생 시 출력
	    }

	    long end = System.nanoTime();  //끝 시간 측정
	    return end - start;  // 소요 시간 반환
		}
	
	
	public long method2 (String str) {
		long start = System.nanoTime();
		char[] data = new char[10000];
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(str + "\\나비야2.dat")))) { 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
	    return end - start;
	}
	
	
	
	}

	









