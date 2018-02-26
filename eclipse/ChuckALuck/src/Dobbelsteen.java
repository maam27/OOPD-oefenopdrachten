import java.util.Random;

public class Dobbelsteen {
	private int laatstGedobbeld;

	public void dobbel() {
		Random r = new Random();
		laatstGedobbeld = r.nextInt(6);
	}

	public String toString() {
		return "Er is: " + laatstGedobbeld + " gedobbeld.";
	}

	public int getLaatstGedobbeld() {
		return laatstGedobbeld;
	}

	public void setLaatstGedobbeld(int laatstGedobbeld) {
		this.laatstGedobbeld = laatstGedobbeld;
	}
}
