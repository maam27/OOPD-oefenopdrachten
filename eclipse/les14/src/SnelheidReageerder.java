public class SnelheidReageerder implements IReageerder {

	@Override
	public void doeActie(WeergaveObject w) {
		w.ax++;
		w.ay++;
	}

}
