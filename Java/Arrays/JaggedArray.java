
import java.util.Scanner;

public class JaggedArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int[][] a = new int[rows][];
		for(int i=0;i<rows;i++) {
			int cols = sc.nextInt();
			a[i] = new int[cols]; 
			
			for(int j=0;j<cols;j++) {
				a[i][j] = sc.nextInt();
				
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
