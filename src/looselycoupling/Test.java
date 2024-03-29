package looselycoupling;

public class Test {
	public static void main(String[] args) {
		
		Traveller t=new Traveller();
		
		t.setV(new Car());
		
		t.startJourney();
		
        t.setV(new Flight());
        
        t.startJourney();
	}

}
