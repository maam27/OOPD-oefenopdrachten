import processing.core.PApplet;

public class main extends PApplet{
	public static void main(String[] args) {
		PApplet.main(new String[] {"main"});
	}
	
	public void settings() {
		size(800,600);
	}
	
	public void setup() {
		fill(0);
	}
	
	public void draw() {
		background(255);
		ellipse(width/2,height/2,width,height);
	}
	
	
	
}
