
import java.util.Scanner;

public class DailyWishes {
	public static void main(String[] args) {
		System.out.println("Enter the time in 24HR format (Strictly between 1-24) : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String res = (x>=5 && x<12)?"Good Morning":
			(x>=12 && x<17)?"Good Afternoon":
				(x>=17 && x<22)?"Good Evening":
					((x>=22 && x<=24) || (x>=1 && x<5))?"Good Night":
						"Number out of range";
		String ans = x>24?"Sorry! ":"Hello! ";
		System.out.println(ans+res);
	}
}
