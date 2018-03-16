import processing.core.PApplet;

public class Rechthoek extends Figuur{
	public Rechthoek(int x, int y, int w, int h) {
		super(x,y,w,h);
	}
	
	public Rechthoek(int x, int y, int w, int h, int c) {
		super(x,y,w,h,c);
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		if(this.isZichtbaar) {
			app.fill(this.vulkleur);
			app.rect(startX+x, startY+y, breedte, hoogte);
		}
	}

	@Override
	protected boolean isMuisBinnen(float muisX, float muisY) {
		if (muisX >= x && muisX < x + breedte &&
				muisY >= y && muisY < y + hoogte) {
			return true;
		}
		else {
			return false;
		}
	}

}
