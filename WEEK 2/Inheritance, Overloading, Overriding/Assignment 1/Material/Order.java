package Material;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<Laptops> lap=new ArrayList<>();
        ArrayList<Accessories> accs=new ArrayList<>();
        System.out.println("Start Ordering for Laptops OR Accesssories");

        do{
            System.out.println("What do you wan to order ?");
            System.out.println("Enter 1 for Laptop");
            System.out.println("Enter 2 for Accessories");
            System.out.println("Enter anything else ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the unique id ");
                    int id_lap=sc.nextInt();
                    System.out.println("Enter the Size of Laptop in Inches");
                    int size=sc.nextInt();
                    Laptops l1=new Laptops(id_lap,size);
                    lap.add(l1);
                    break;
                case 2:
                    System.out.println("Enter the unique id ");
                    int id_accs=sc.nextInt();
                    System.out.println("Enter the Color of Accessory");
                    String color=sc.next();
                    Accessories a1=new Accessories(id_accs,color);
                    accs.add(a1);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Wrong Input");

            }
            System.out.println("Do You Want to Continue ?");
            System.out.println("If Yes ! then type 'Yes' else type 'No' ");
        }while(sc.next().toString().equals("Yes"));

        System.out.println("Laptop count is = "+Laptops.quantity);
		System.out.println("Accessory count is = "+Accessories.quantity);

        if(Laptops.quantity< 3 || Accessories.quantity< 5)
            System.out.println("RequestForMaterial (RFM) is to be generated");
        
    }
    
}
