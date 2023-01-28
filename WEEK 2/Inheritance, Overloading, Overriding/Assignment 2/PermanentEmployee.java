public class PermanentEmployee extends Employee {

    private double basicPay;
    private double hra;
    private float experience;

    public double getbasicPay() {
        return this.basicPay;
    }

    public void setbasicPay(double basicPay)  {
        this.basicPay = basicPay;
    }

    public double gethra() {
        return this.hra;
    }

    public void sethra(double hra)  {
        this.hra = hra;
    }

    public float getexperience() {
        return this.experience;
    }

    public void setexperience(float experience)  {
        this.experience = experience;
    }

    public PermanentEmployee(int employeeId, String employeeName,double basicPay, double hra,float experience) {
        super(employeeId, employeeName);
        this.basicPay=basicPay;
        this.hra=hra;
        this.experience=experience;
    }
    void calculateMonthlySalary()
    {
        double variablecomponent=0;
        float experience=this.experience;
        if(experience<3)
        {
            variablecomponent=0;
        }
        else if(experience>=3 && experience<5)
        {
            variablecomponent+=(basicPay*5)/100;
        }
        else if(experience>=5 && experience<10)
        {
            variablecomponent+=(basicPay*7)/100;
        }
        else if(experience>=10 )
        {
            variablecomponent+=(basicPay*12)/100;
        }
        double sal=Math.round(this.basicPay+this.hra+variablecomponent);
        setSalary(sal);
    }

    
}
