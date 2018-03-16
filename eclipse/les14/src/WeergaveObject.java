
import java.util.ArrayList;

import processing.core.PApplet;

public abstract class WeergaveObject {
	protected float x,y,vx,vy,ax,ay = 0;
	protected float breedte, hoogte = 0;
	protected boolean isZichtbaar = true;
	
	protected ArrayList<IReageerder> reageerdersLijst = new ArrayList<>();
	
	public WeergaveObject(float x, float y, float w, float h) {
		this.x=x;
		this.y=y;
		this.breedte=w;
		this.hoogte=h;
	}
	
	public void doeStap() {
		x+=vx;
		y+=vy;
		vx+=ax;
		vy+=ay;
	}
	
	public abstract void geefWeer(PApplet app, float x, float y);
	
	public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
		if(this.isMuisBinnen(mouseX, mouseY)) {
			for(IReageerder f: reageerdersLijst) {
				f.doeActie(this);
			}
		}
	}
	
	protected abstract boolean isMuisBinnen(float muisX, float muisY);
	
	protected void behandelMousePressedGebeurtenis() {
		
	}
	
	public void voegReageerderToe(IReageerder reageerder) {
		this.reageerdersLijst.add(reageerder);
	}

	public void verwijderReageerderToe(IReageerder reageerder) {
		this.reageerdersLijst.remove(reageerder);
	}	
	
	
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getVx() {
		return vx;
	}
	public void setVx(float vx) {
		this.vx = vx;
	}
	public float getAx() {
		return ax;
	}
	public void setAx(float ax) {
		this.ax = ax;
	}
	public float getVy() {
		return vy;
	}
	public void setVy(float vy) {
		this.vy = vy;
	}
	public float getAy() {
		return ay;
	}
	public void setAy(float ay) {
		this.ay = ay;
	}
	public float getBreedte() {
		return breedte;
	}
	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}
	public float getHoogte() {
		return hoogte;
	}
	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}
	public boolean isZichtbaar() {
		return isZichtbaar;
	}
	public void setZichtbaar(boolean isZichtbaar) {
		this.isZichtbaar = isZichtbaar;
	}
	
	
}
