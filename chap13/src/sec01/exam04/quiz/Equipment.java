package sec01.exam04.quiz;

import java.util.Objects;

public class Equipment {
	// 필드 
	private String name;
	private int pricePerDay;
	
	// 생성자
	public Equipment () {
		
	}
	
	public Equipment(String name, int pricePerDay) {
		this.name = name;
		this.pricePerDay = pricePerDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerDay);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		return Objects.equals(name, other.name) && pricePerDay == other.pricePerDay;
	}
	
	
	@Override
	public String toString() {
		return "- " + name + ": " + pricePerDay +"원";
		
	}

}
