package homework.method2;

public class Run {

	public static void main(String[] args) {
		ExMethodController emc = new ExMethodController();
		
		emc.printMessage("Hello world!");
		
		System.out.println(emc.sum1To100());
		
		System.out.println(emc.checkEvenOdd(357));
		
		System.out.println(emc.hasEnglishChar("나a비"));
		
		emc.checkCharCount("간장공장공장장공고고공", '공');
		
		emc.printGoogoodan(3);

	}

}
