import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngineApp extends PApplet{

	ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();
	
	public static void main(String[] args) {
        PApplet.main(new String[] {"GraphicsEngineApp"});
	}
	
	public void settings() {
		size(400, 400);	
	}
	
	public void setup() {
		weergaveLijst.add(new Rechthoek(0,0,20,50));
		Rechthoek r = new Rechthoek(50,90,200,50);
		r.setVulkleur(150);
		r.voegReageerderToe(new HalloReageerder());
		r.setAx(5);
		weergaveLijst.add(r);
	}
	
	public void draw() {
		for(WeergaveObject wg : weergaveLijst) {
			wg.geefWeer(this, 0, 0);
		}
	}
	
	public void mousePressed() {
		for(WeergaveObject wg : weergaveLijst) {
			wg.geefMousePressedGebeurtenis(mouseX, mouseY);
		}
		
	}

}
