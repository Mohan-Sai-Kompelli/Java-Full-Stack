import java.util.Scanner;

public class Ages {
	public static void main(String[] args) {
		System.out.println("Enter the age please : ");
		Scanner sc = new Scanner(System.in);
		int x  = sc.nextInt();
		String res = x<=12?"KID":(x>12 && x<=19)?"TEEN":(x>=20 && x<64)?"ADULT":"OLD GEEZER";
		System.out.println("You are  "+res );
	}
}
