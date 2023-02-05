class ImplementFI implements F1 {
    @Override
    public void cube(int a) {
        System.out.println("Overridden cube method gives result as : "+a*a*a);
    }
}

public class Main {
    public static void main(String[] args) {
        ImplementFI obj = new ImplementFI();
        obj.cube(3);
        obj.square(3);
        F1.sub(5,3);
        F1.mul(2,9);
        F1.div(25,5);
    }
}