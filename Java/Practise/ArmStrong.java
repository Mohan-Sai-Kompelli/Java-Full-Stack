
import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to check ArmStroing or Not : ");
		int n = sc.nextInt();
		isArmStrong(n);
	}
	public static void isArmStrong(int n) {
		int cnt = 0;
		int sum = 0;
		while(n>0) {
			int d = n%10;
			cnt++;
			n = n/10;
		}
		while(n>0) {
			int d = n%10;
			sum+=Math.pow(d, cnt);
			n = n/10;
		}
	
	if(sum==n) {
		System.out.println("YES !! it is a ArmStrong Number");
	}
	else {
		System.out.println("NO !! it is not a ArmStrong Number");
	}
	}

}
