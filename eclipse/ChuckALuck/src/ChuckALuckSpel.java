public class ChuckALuckSpel {
	private int geluksGetal, saldo, inzet, ronde;
	private Dobbelbeker dobbelBeker;

	public ChuckALuckSpel(int saldo) {
		this.saldo = saldo;
		this.ronde = 0;
		dobbelBeker = new Dobbelbeker(3);
	}

	public void speelRonde(int nummer, int inzet) {
		ronde++;
		this.geluksGetal = nummer;
		this.inzet = inzet;
		int komtVoor = 0;
		for (int i = 0; i < dobbelBeker.ds.length; i++) {
			if(dobbelBeker.ds[i].getLaatstGedobbeld() == nummer) {
				komtVoor++;
			}
		}
		switch(komtVoor) {
		case 0:
			saldo = saldo - inzet;
			break;
		case 1:
			break;
		case 2:
			saldo = saldo + (inzet*2);
			break;
		case 3:
			saldo = saldo + (inzet*10);
		}
	}

public String toString() {
	
	
return "Ronde: " + ronde + "\nGeluksgetal: " + geluksGetal + " Saldo:" + saldo; 
}

}