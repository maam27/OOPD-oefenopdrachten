import processing.core.PApplet;

public class Tekstraam implements IDoelwit{
	PApplet app =null;
	String tekst = "";
	float x = 0;
	float y = 0;
	
	public Tekstraam(PApplet app,String tekst, float x, float y) {
		this.app = app;
		this.tekst = tekst;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void schakel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teken() {
		// TODO Auto-generated method stub
		
	}

	
}
