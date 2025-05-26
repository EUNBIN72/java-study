package homework.homework2;

public class Chocolate extends Cake {
	// 필드
	private int cherry;
	private int chip;
	
	// 생성자
	public Chocolate() {
		
	}
	
	public Chocolate (double flour, double cream, int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}

	
	//getter()/setter()
	public int getCherry() {
		return cherry;
	}

	public void setCherry(int cherry) {
		this.cherry = cherry;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}
	
	
	// 필드에 담긴 데이터를 반환하는 메소드
	public String toString() {
		return super.toString() + "체리 : " + cherry + "(개)" + "\n초콜릿 칩 : " + chip + "(개)\n초콜릿 케이크가 완성되었습니다.";
	}


}
