public abstract class Figuur extends WeergaveObject {
	public Figuur(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	protected int vulkleur = 0;

	public int getVulkleur() {
		return vulkleur;
	}

	public void setVulkleur(int vulkleur) {
		this.vulkleur = vulkleur;
	}

}
