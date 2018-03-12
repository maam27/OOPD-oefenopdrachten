import processing.core.PApplet;

public class main extends PApplet{
	
	private Vorm c,r;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PApplet.main(new String[] {"main"});
	}
	
	public void settings() {
		size(800,600);
	}
	
	public void setup() {
        c = new Cirkel(20,20,20);
        r = new Rechthoek(20,20,40,40);
        c.setSnelheid(5, 10);
        r.setSnelheid(5, 10);
        r.setVersnelling(1, -4);
        noLoop();
	}
	public void draw() {
		background(0);
		c.teken(this);
		r.teken(this);
		c.doeStap();
		r.doeStap();
		
	}
	
	public void mousePressed() {
		redraw();
	}

}
