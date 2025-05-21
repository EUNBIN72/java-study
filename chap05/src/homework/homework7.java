package homework;

import java.util.Arrays;

public class homework7 {
	public static void main(String[] args) {
		// 7. 문서 복사하기
		
		String[] report = {"Introduction", "Research", "Conclusion"};
		
		String[] newArray = new String[3];
		
		
		String reportStr = ""; // 출력용
		for (int i = 0; i < report.length; i++) {
			reportStr += (report[i] + ", ");
		}
		System.out.println("원본 보고서: " + reportStr);
		
		
		// 배열 복사 완료
		for (int i = 0; i < report.length; i++) {
			// i가 0번째 배열부터 newArray배열에 복사함
			newArray[i] = report[i];
			// 만약 report 0번째 배열이 Introduction이면 Team Feedback으로 변경해라
			if (report[0] == "Introduction") {
				newArray[0] = "Team Feedback";
			}
		}
	
		// 만약 0번째 배열이면 Team Feedback으로 변경
		
		String newStr = "";
		for (int i = 0; i < newArray.length; i++) {
//			newStr += (newArray[i] + ", ");
			newStr += newArray[i];
			if (i < newArray.length - 1) newStr += ", ";
		}
		System.out.println("복사된 보고서: " + newStr);
		
	}

}
