package Material;

public class Tester {

	public static void main(String[] args) {

		//Creating 5 Laptops
		Laptops l1=new Laptops(101,14);
		Laptops l2=new Laptops(102,16);
		Laptops l3=new Laptops(103,12);
		Laptops l4=new Laptops(104,12);
		Laptops l5=new Laptops(105,14);

		//Creating 10 Accessory Products
		Accessories a1=new Accessories(301,"Red");
		Accessories a2=new Accessories(302,"White");
		Accessories a3=new Accessories(303,"Red");
		Accessories a4=new Accessories(304,"Black");
		Accessories a5=new Accessories(305,"Red");
		Accessories a6=new Accessories(306,"Blue");
		Accessories a7=new Accessories(307,"White");
		Accessories a8=new Accessories(308,"Purple");
		Accessories a9=new Accessories(309,"Black");
		Accessories a10=new Accessories(3010,"Blue");
		
		System.out.println("Laptop count is = "+Laptops.quantity);
		System.out.println("Accessory count is = "+Accessories.quantity);
		
	}

}
