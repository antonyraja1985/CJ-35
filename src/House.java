
public class House {

	
	public void portico() {

		System.out.println("portico");
	}

	// ctrl+shift+f
	public void hall() {

		System.out.println("hall");
	}

	public void room1() {

		System.out.println("hall");
	}

	public void room2() {

		System.out.println("hall");
	}

	public static void main(String[] args) {

		System.out.println("abcd villa");
		

		House h = new House();
		h.kitchen();
		h.portico();
		h.hall();
		
	}

	public void kitchen() {

		System.out.println("kitchen");
	}

	public void storeroom() {

		System.out.println("store");
	}
}
