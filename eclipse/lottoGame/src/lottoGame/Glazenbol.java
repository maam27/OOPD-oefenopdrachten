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
		return ballen.remove(new Random().nextInt(ballen.size()));
	}
}
