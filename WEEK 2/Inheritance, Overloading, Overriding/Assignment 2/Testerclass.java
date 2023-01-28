public class Testerclass {
    public static void main(String[] args) {
        ContractEmployee c1=new ContractEmployee(101, "Akash", 200, 5);
        PermanentEmployee p1=new PermanentEmployee(301, "Jit", 50000, 5500, 15);
        c1.calculateSalary();
        p1.calculateMonthlySalary();

        System.out.println("Salary of "+c1.getEmployeeName()+" is :"+ c1.getSalary());
        System.out.println("Salary of "+p1.getEmployeeName()+" is : "+p1.getSalary());
    }
}
