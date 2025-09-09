import java.util.Scanner;
public class CompoundiIntrestTotal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for P : ");
		int p = sc.nextInt();
		System.out.println("Enter the value for r : ");
		int r = sc.nextInt();           // here if we take double instead of int it weill show ous the rror becausde the power function canno tb e done to double values
		System.out.println("Enter the value for n : ");
		int n = sc.nextInt();
		System.out.println("Enter the value for t : ");
		int t = sc.nextInt();
		double CI = p*(1+(r/n))^(n*t);
		// we cannot to the power operation to the double values 
		// eg we can do 2^3 but not 2^3.67  
		// evewn though it occues rarely in real time but we cant do it in java
		double total = CI+p;
		System.out.println("The Compound amount of CI is : "+CI);
		System.out.println("The total amount is : "+total);
		
	}

}
