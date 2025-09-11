
import java.util.Scanner;

public class ZeroEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] t = new int[n];
		for(int j=0;j<n;j++) {
			a[j] = sc.nextInt();
			
		}
		int k=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=0) {
				t[k] = a[i];
				k++;
			}
		}
		while(k<n) {
			t[k] =0;
			k++;
		}
		for(int i=0;i<n;i++) {
			System.out.print(t[i]+" ");
		}
	}
}
