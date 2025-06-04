package sec01.exam06.quiz;

public class Planet {
	// 필드
	private String name;
	private int diameter;
	private double period;
	
	
	// 생성자
	public Planet() {
		
	}

	public Planet(String name, int diameter, double period) {
		this.name = name;
		this.diameter = diameter;
		this.period = period;
	}

	
	//getter()
	public String getName() {
		return name;
	}

	public int getDiameter() {
		return diameter;
	}

	public double getPeriod() {
		return period;
	}
	
	
	
	// 메소드
	//toString()
	@Override
	public String toString() {
		return  name + "(지름: " + diameter + "km, 공전주기: " + period + "년)";
	}

}
