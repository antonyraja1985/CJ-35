package looselycoupling;

public class Traveller {
	
	private Vechichle v;

	
	public Vechichle getV() {
		return v;
	}

	public void setV(Vechichle v) {
		this.v = v;
	}
	
	
	public void startJourney() {
		v.move();
	}
	

}
