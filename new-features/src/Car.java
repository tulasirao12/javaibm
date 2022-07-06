
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String... features) {	// var-args
		super();
		this.model = model;
		this.features = features;
	}
	public void specs() {
		System.out.println("Features of"+ model);
		for(String f: features) {
			System.out.println("- "+f);
		}
	}
	public static void main(String[] args) {
		String[] ar ={"touch","Lcd","gearindicator"};
		Car alto = new Car("Suzuki Alto", "touch","Lcd","gearindicator");
		Car venue = new Car("Hynduai Venue", "touch","Lcd","gearindicator","Ac","abs","power steering");
		
		alto.specs();
		venue.specs();

	}

}
