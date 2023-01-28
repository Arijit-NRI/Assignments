public class ContractEmployee extends Employee{
    private double wage;
    private float hoursWorked;

    public double getwage() {
        return this.wage;
    }

    public void setwage(double wage)  {
        this.wage = wage;
    }

    public float gethoursWorked() {
        return this.hoursWorked;
    }

    public void sethoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



    public ContractEmployee(int employeeId, String employeeName,double wage,float hoursWorked) {
        super(employeeId, employeeName);
        this.wage=wage;
        this.hoursWorked=hoursWorked;
    }

    void calculateSalary()
    {
        setSalary(this.hoursWorked*this.wage);
    }

    
    
    
}
