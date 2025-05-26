package homework.homework2;

public class GreenTea extends Cake {
	// 필드
	private double powder;
	private int cheese;
	
	// 생성자
	public GreenTea() {
		
	}
	
	public GreenTea(double flour, double cream, double powder, int cheese) {
		super(flour, cream);
		this.powder = powder;
		this.cheese = cheese;
	}
	

	//getter()/setter()
	public double getPowder() {
		return powder;
	}

	public void setPowder(double powder) {
		this.powder = powder;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	
	// 필드에 담긴 데이터를 반환하는 메소드
	public String toString() {
		return super.toString() + "녹차 파우더 : " + powder + "(g)" + "\n치즈 큐브 : " + cheese + "(개)\n치즈 케이크가 완성되었습니다.";
	}


}
