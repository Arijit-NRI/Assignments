package Material;
import Stock.Inventory;

public class Laptops extends Inventory {
	
	public static int quantity =0;
	int unique_id_laptop;
	int size_in_inches;

	public Laptops(int unique_id_laptop,int size_in_inches) {
		super(3);
		Laptops.quantity++;
		this.unique_id_laptop=unique_id_laptop;
		this.size_in_inches=size_in_inches;
		
	}
	
}
