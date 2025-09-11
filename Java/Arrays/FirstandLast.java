
import java.util.Scanner;

public class FirstandLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		boolean x = false;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int j=0;j<m;j++) {
			b[j] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[0]==b[0] || a[n-1]==b[m-1]) {
				x = true;
			}
			
		}
		System.out.println(x);
		

	}

}
