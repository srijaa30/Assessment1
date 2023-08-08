import java.util.ArrayList;
import java.util.Scanner;
interface MenuItem
{
	void Sandwich(char a);
	void Drink(char a);
	void Salad(char a);
	void Trio(char a);
	
}
class Sandwich implements MenuItem
{
	int sum=0;
	@Override
	public void Sandwich(char a) {
		switch(a)
		{
		case 'p':
		{
			System.out.print("Panneer sandwich/");
			sum+=10;
			break;
		}
		case 'c':
		{
			System.out.print("Corn sandwich/");
			sum+=20;
			break;
		}
		case 'm':
		{
			System.out.print("Mushroom sandwich/");
			sum+=30;
			break;
		}
		default:
		{
			System.out.println("Sorry! Not Available");
		}
		}
		
	}

	@Override
	public void Drink(char a) {	
	}

	@Override
	public void Salad(char a) {	
	}

	@Override
	public void Trio(char a) {	
	}
	
}
class Drink implements MenuItem
{
	int sum=0;
	@Override
	public void Sandwich(char a) {
	}

	@Override
	public void Drink(char a) {
		switch(a)
		{
		case 'l':
		{
			System.out.print("Lemon Juice/");
			sum+=10;
			break;
		}
		case 'c':
		{
			System.out.print("Carrot Juice/");
			sum+=20;
			break;
		}
		case 'o':
		{
			System.out.print("Orange Juice/");
			sum+=30;
			break;
		}
		default:
		{
			System.out.println("Sorry! Not Available");
		}
		}
		
	}

	@Override
	public void Salad(char a) {
	}

	@Override
	public void Trio(char a) {
	}
	
}
class Salad implements MenuItem
{
	int sum=0;
	@Override
	public void Sandwich(char a) {
	}

	@Override
	public void Drink(char a) {
	}

	@Override
	public void Salad(char a) {
		switch(a)
		{
		case 'v':
		{
			System.out.print("Veggie salad/");
			sum+=10;
			break;
		}
		case 'c':
		{
			System.out.print("Corn salad/");
			sum+=20;
			break;
		}
		case 'm':
		{
			System.out.print("Mixed fruit salad/");
			sum+=30;
			break;
		}
		default:
		{
			System.out.println("Sorry! Not Available");
		}
		}
	}

	@Override
	public void Trio(char a) {
	}
	
}
class Trio implements MenuItem
{

	@Override
	public void Sandwich(char a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Drink(char a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Salad(char a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Trio(char a) {
		// TODO Auto-generated method stub
		
	}
	void display()
	{
		Scanner sc=new Scanner(System.in);
		char sandwich=sc.next().charAt(0); 
		char drink=sc.next().charAt(0);
		char salad=sc.next().charAt(0);
		int fsum=0;
		Sandwich s=new Sandwich();
		s.Sandwich(sandwich);
		fsum+=s.sum;
		Drink d=new Drink();
		d.Drink(drink);
		fsum+=d.sum;
		Salad ss=new Salad();
		ss.Salad(salad);
		fsum+=ss.sum;
		System.out.print(fsum);
		
	}

	
}
public class Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		int sum=0;
		Trio t=new Trio();
		t.display();

	}

}
