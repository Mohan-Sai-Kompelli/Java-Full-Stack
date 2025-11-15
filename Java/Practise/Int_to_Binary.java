
import java.util.Scanner;

public class Int_to_Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i=0;i<m;i++) {
			b[i] = sc.nextInt();
			if(b[i]>1 || b[i]<0) {
				break;
			}
			
		}
		toBinary(n);
		toInt(m,b);
	}
	public static void toBinary(int n) {
		int x = n;
		int z=n;
		int[] a = new int[n];
		int i=0;
		while(z>0 || i<=n-1) {
			int d =x/2;
			int k = x%2;
			a[i] = k;
			i++;
			x = d;
			z = k;
		}
		for(int j=n-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
	
	public static void toInt(int m,int[] b) {
		int x = 0;
		int j=0;
		for(int i=m-1;i>=0;i--) {
			x+=Math.pow(2, j)*b[i];
			j++;
		}
		System.out.println(x);
	}

}
