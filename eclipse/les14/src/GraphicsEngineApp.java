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
		noLoop();
		//weergaveLijst.add(new Rechthoek(0,0,20,50));
		//weergaveLijst.add(new Rechthoek(0,060,20,50,90));
		
		Rechthoek r = new Rechthoek(50,90,200,50,160);
		r.voegReageerderToe(new SnelheidReageerder());
		r.voegReageerderToe(new HalloReageerder());
		r.setAx(1);	
		r.setAy(-1);	
		WeergaveObjectContainer cont = new WeergaveObjectContainer(250,250);
		//this.weergaveLijst.add(r);
		
		cont.voegToe(new Rechthoek(0,0,50,25,0xFFFFFFFF));
		Rechthoek obj = new Rechthoek(0,0,25,50,0xFF0ff000);
		obj.voegReageerderToe(new SnelheidReageerder());
		cont.voegToe(obj);
		cont.voegReageerderToe(new SnelheidReageerder());
		cont.voegReageerderToe(new HalloReageerder());
		cont.setAx(0);
		cont.setAx(0);
		this.weergaveLijst.add(cont);
	}
	
	public void draw() {
		this.background(0);
		for(WeergaveObject wg : weergaveLijst) {
			wg.geefWeer(this, 0, 0);
			wg.doeStap();
		}
	}
	
	public void mousePressed() {
		redraw();
		for(WeergaveObject wg : weergaveLijst) {
			wg.geefMousePressedGebeurtenis(mouseX, mouseY);
		}
		
	}

}
