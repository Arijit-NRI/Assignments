public class Calculator {

    Calculator()
    {
        
    }

    public void findAvg(double a1,double a2)
    {
        double num3 = (a1+a2)/2;
        System.out.println(Math.round(num3*100.0)/100.0);
    }
    public void findAvg(double a1,double a2,double a3)
    {
        double num3 = (a1+a2+a3)/3;
        System.out.println(Math.round(num3*100.0)/100.0);
    }
    public void findAvg(double a1,double a2,double a3,double a4)
    {
        double num3 = (a1+a2+a3+a4)/4;
        System.out.println(Math.round(num3*100.0)/100.0);
    }
    
}
