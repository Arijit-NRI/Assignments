package Stock;

public class Inventory {
	int quantity;
	int lowOrderLevelQuantity;
	
	public Inventory() {
	}

	public Inventory(int lowOrderLevelQuantity) {
		this.lowOrderLevelQuantity = lowOrderLevelQuantity;
	}
	
}
