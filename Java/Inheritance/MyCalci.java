
import java.util.Scanner;

public class MyCalci extends Calci{
	

	public MyCalci(int a,int b) {
		super(a,b);
	}
	
	public void mul() {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		MyCalci c = new MyCalci(a,b);
		c.add();
		c.mul();
		
	}
}
