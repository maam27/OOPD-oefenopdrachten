import processing.core.PApplet;

public class main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"main"});
	}
	
	ChuckALuckSpel cal;

	public void settings() {
		size(800,600);
	}
	
	public void setup() {
		cal = new ChuckALuckSpel(0);
		cal.speelRonde(3, 5);
		println(cal);
	}
	
	public void draw() {
		
	}

}
