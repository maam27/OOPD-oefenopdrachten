import processing.core.PApplet;

public class Rechthoek extends Figuur{
	public Rechthoek(int x, int y, int w, int h) {
		super(x,y,w,h);
	}

	@Override
	public void geefWeer(PApplet app, int startX, int startY) {
		if(this.isZichtbaar) {
			app.fill(this.vulkleur);
			app.rect(x, y, breedte, hoogte);
		}
	}

	@Override
	protected boolean isMuisBinnen(int muisX, int muisY) {
		if (muisX >= x && muisX < x + breedte &&
				muisY >= y && muisY < y + hoogte) {
			return true;
		}
		else {
			return false;
		}
	}

}
