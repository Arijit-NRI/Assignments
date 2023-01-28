package Material;

import Stock.Inventory;

public class Accessories extends Inventory {
	
	public static int quantity =0;
	int unique_id_accessory;
	String color;

	
	public Accessories(int unique_id_accessory,String color) {
		super(5);
		Accessories.quantity++;
		this.unique_id_accessory=unique_id_accessory;
		this.color=color;
	}
	
}
