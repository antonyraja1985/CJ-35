package tightcoupling;

public class Traveller {
	
	Flight c=new Flight();	
	
	public void startJourney() {
		
		c.move();
	}
	
	
	public static void main(String[] args) {
		
		Traveller t=new Traveller();
		t.startJourney();
		
	}

}
