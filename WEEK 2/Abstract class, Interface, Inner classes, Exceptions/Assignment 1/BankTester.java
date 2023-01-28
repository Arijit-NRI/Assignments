public class BankTester {
    public static void main(String[] args) {
        BankA a=new BankA();
        BankB b=new BankB();
        BankC c=new BankC();
        System.out.println("Bank A return is RS "+a.getBalance());
        System.out.println("Bank B return is RS "+b.getBalance());
        System.out.println("Bank C return is RS "+c.getBalance());
    }
}
