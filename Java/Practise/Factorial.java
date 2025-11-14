
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorial(n);
	}

	public static void factorial(int n) {
		int x = n;
		int mul = 1;
		while(x>0) {
			int d = x;
			mul*=d;
			x-=1;
		}
		System.out.println(mul);
	}
}
