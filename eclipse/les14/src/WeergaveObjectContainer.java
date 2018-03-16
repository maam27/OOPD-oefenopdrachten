import java.util.ArrayList;

import processing.core.PApplet;

public class WeergaveObjectContainer extends WeergaveObject{

	protected ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();
	
	public WeergaveObjectContainer(int x, int y) {
		super(x, y, 0, 0);
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		for(WeergaveObject w: this.weergaveLijst) {	
			w.geefWeer(app, this.x, this.y);
		}
	}

	@Override
	protected boolean isMuisBinnen(int muisX, int muisY) {
		for(WeergaveObject w: this.weergaveLijst) {
			if(w.isMuisBinnen(muisX, muisY)) {
				System.out.println(w.isMuisBinnen(muisX, muisY));
				return w.isMuisBinnen(muisX, muisY);
			}
		}		
		return false;
	}
	
	public void doeStap() {
		super.doeStap();
		for(WeergaveObject w: this.weergaveLijst) {
			w.doeStap();
		}
	}
	
	public void voegToe(WeergaveObject wo) {
		this.weergaveLijst.add(wo);
	}
	
	public void verwijder(WeergaveObject wo) {
		this.weergaveLijst.remove(wo);
	}
	
}
