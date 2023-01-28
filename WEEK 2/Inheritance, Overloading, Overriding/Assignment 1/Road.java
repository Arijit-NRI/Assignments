import java.util.Scanner;

public class Road {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Truck details");
		System.out.println("Enter color, no_of wheels, model,travel_location");
		Truck t=new Truck(sc.next(),sc.nextInt(),sc.next(),sc.next());
		System.out.println("Enter Bus details");
		System.out.println("Enter color, no_of wheels, model,max_km_covered");
		Bus b=new Bus(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
		System.out.println("Enter Car details");
		System.out.println("Enter color, no_of wheels, model,no_of_seater");
		Car c=new Car(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
		System.out.println("Truck details are color: "+t.color+" Model: "+t.model+" Wheels: "+t.no_of_wheels+" Travel Location: "+t.travel_location);
		System.out.println("Bus details are color: "+b.color+" Model: "+b.model+" Wheels: "+b.no_of_wheels+" Max Distance Covered: "+b.max_km_covered);
		System.out.println("Car details are color: "+c.color+" Model: "+c.model+" Wheels: "+c.no_of_wheels+" Seater : "+c.no_of_seater);
	}

}
