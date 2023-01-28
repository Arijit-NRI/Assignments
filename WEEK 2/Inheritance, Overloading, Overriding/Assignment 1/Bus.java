
public class Bus extends Vehicle {
	int max_km_covered;
	public Bus(String color,int no_of_wheels,String model,int max_km_covered) {
		super(color,no_of_wheels,model);
		this.max_km_covered=max_km_covered;
	}

}
