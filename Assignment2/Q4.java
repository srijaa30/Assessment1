import java.util.Scanner;

interface DigitalTree
{
	int AbsorbSunlight(int h);
	void getTreeDetails();
}
class BinaryTree implements DigitalTree
{
	Scanner sc=new Scanner(System.in);
	int trees=sc.nextInt();
	int sl=0;
	@Override
	public int AbsorbSunlight(int h) {
		sl=2*h;
		return 0;
	}

	@Override
	public void getTreeDetails() {
		System.out.println(trees+" Binary Oak "+sl);
		
	}
	
}
class QuantumTree implements DigitalTree
{

	Scanner sc=new Scanner(System.in);
	int trees=sc.nextInt();
	int sl=0;
	@Override
	public int AbsorbSunlight(int h) {
		sl=h*6;
		return 0;
	}

	@Override
	public void getTreeDetails() {
		System.out.println(trees+" Quantum Oak "+sl);
	}
	
}
class NeutralTree implements DigitalTree
{
	Scanner sc=new Scanner(System.in);
	int trees=sc.nextInt();
	int sl=0;

	@Override
	public int AbsorbSunlight(int h) {
		sl=h*3;
		return 0;
	}

	@Override
	public void getTreeDetails() {
		System.out.println(trees+" Neutral "+sl);
		
	}
	
}
public class Q4 {
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		b.AbsorbSunlight(2);
		b.getTreeDetails();
		QuantumTree q=new QuantumTree();
		q.AbsorbSunlight(3);
		q.getTreeDetails();
		NeutralTree n=new NeutralTree();
		n.AbsorbSunlight(4);
		n.getTreeDetails();
		
	}

}
