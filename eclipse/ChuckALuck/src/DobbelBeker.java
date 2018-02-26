public class Dobbelbeker {
	Dobbelsteen[] ds;
			
	public Dobbelbeker(int numberOfDice) {
		this.ds = new Dobbelsteen[numberOfDice];
		for(int i=0; i<ds.length;i++) {
			ds[i] = new Dobbelsteen();			
		}		
	}
	
	public void rollDice() {
		for(Dobbelsteen steen: ds) {
			steen.dobbel();			
		}
	}
	
	public String toString() {
		String tmp="";
		for(Dobbelsteen steen: ds) {
			tmp += " "+steen.getLaatstGedobbeld();
		}		
		return "U heeft gegooid:"+tmp;
	}
	
}