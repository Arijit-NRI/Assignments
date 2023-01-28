
public class Truck extends Vehicle {

	String travel_location;

	public Truck(String color,int no_of_wheels,String model,String travel_location) {
		super(color,no_of_wheels,model);
		this.travel_location=travel_location;
	}

}
