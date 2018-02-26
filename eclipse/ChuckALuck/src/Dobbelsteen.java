import java.util.Random;

public class Dobbelsteen {
	int lastRoll = -1;
	
	public Dobbelsteen() {
		
	}
	
	public void dobbel() {
		this.lastRoll = new Random().nextInt(6);
	}
	
	public int getLaatstGedobbeld() {
		return lastRoll;
	}
}
