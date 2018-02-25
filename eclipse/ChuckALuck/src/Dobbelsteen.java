import java.util.Random;

public class Dobbelsteen {
	int lastRoll = -1;
	
	public Dobbelsteen() {
		
	}
	
	public void rollDice() {
		this.lastRoll = new Random().nextInt(6);
	}
}
