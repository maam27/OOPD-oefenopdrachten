package lottoGame;

import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {
	private ArrayList<Lottobal> ballen = new ArrayList<Lottobal>();
	
	public Glazenbol() {
		
	}

	public void verzamelAlleBallen() {
		for(int i=0; i<45;i++) {
			ballen.add(new Lottobal(i+1));
		}
	}
	
	public Lottobal schepBal() {
		int random = new Random().nextInt(ballen.size());
		Lottobal bal = ballen.get(random);
		ballen.remove(random);
		return bal;
	}
}
