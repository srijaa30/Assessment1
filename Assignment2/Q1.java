import java.util.Scanner;

interface AdvancedArithmetic
{
	int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
	@Override
	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("Sum of the divisors is:- "+sum);
		return 0;
	}	
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		MyCalculator c=new MyCalculator();
		c.divisor_sum(n);	
	}
}
