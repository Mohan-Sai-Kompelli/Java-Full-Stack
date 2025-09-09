
import java.util.Scanner;

public class EvenandOdd {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		String res = x%2==0?"The Number is even":"The number is not even";
		System.out.println(res);
	}
}
