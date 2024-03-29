package compositionexample;

public class Car {
	
	public String carModel;
	public Engine engine;
	
	
	public Car(String carModel, Engine engine) {
		
		this.carModel = carModel;
		this.engine = engine;
	}
	
	public static void main(String[] args) {
		Engine engine=new Engine("honda", 1000);
		Car car=new Car("2024", engine);
	}
	
	

}
