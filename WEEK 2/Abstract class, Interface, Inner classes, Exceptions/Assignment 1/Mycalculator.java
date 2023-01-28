import java.util.Scanner;

interface AdvancedArithmetic {
	
	int divisor_sum(int n);
}
public class Mycalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		
		if(n<1000)
        {
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0) sum+=i;
            }
            return sum;
        }
        else return -1;		
	}

    public static void main(String[] args) {
        Mycalculator calc=new Mycalculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 and 1000");
        int n=sc.nextInt();
        int ans=calc.divisor_sum(n);
        if(ans ==-1)
            System.out.println("Input out of Range");
        else
            System.out.println("Divisor Sum is : "+ans);
    }
}
