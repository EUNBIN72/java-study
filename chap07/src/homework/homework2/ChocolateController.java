package homework.homework2;

public class ChocolateController {
	
	Chocolate c = new Chocolate();
	
	public String bakeChocolateCake (double flour, double cream, int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
		c.setCherry(cherry);
		c.setChip(chip);
		return c.toString();
	}

	public Chocolate getC() {
		return c;
	}

	public void setC(Chocolate c) {
		this.c = c;
	}
	
	

}
