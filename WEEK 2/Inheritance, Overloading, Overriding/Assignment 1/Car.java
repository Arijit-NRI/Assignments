
public class Car extends Vehicle{

	int no_of_seater;
	public Car(String color,int no_of_wheels,String model,int no_of_seater) {
		super(color,no_of_wheels,model);
		this.no_of_seater=no_of_seater;
	}

}
