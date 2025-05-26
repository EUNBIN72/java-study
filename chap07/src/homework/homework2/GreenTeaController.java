package homework.homework2;

public class GreenTeaController {

	private GreenTea gt = new GreenTea();
	
	public String bakeGreenTea(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		return gt.toString();
	}

	public GreenTea getGt() {
		return gt;
	}

	public void setGt(GreenTea gt) {
		this.gt = gt;
	}
}
