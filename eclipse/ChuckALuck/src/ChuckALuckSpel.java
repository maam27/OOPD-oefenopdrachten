
public class ChuckALuckSpel {
	Dobbelbeker db;
	
	public ChuckALuckSpel() {
		this.db = new Dobbelbeker(3);
	}
	
	public void bet(int number, float amount) {
		db.rollDice();
		printPayOut(payOut(amount,numberOfDiceMatching(number)));
	}
	
	private float payOut(float amount, int matchingDice) {		
		return 0;
	}
	
	private int numberOfDiceMatching(int number) {
		return 0;
	}
	
	private void printPayOut(float payOut) {
		
	}
	
}
