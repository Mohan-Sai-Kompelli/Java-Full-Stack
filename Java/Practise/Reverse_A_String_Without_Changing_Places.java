
import java.util.Scanner;

public class Reverse_A_String_Without_Changing_Places {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		rev_words(s);
	}
	public static void rev_words(String s) {
		String[] a = s.split("\\s+");
		StringBuffer ss = new StringBuffer();
		for(int i=0;i<a.length;i++) {
			if(i!=a.length-1) ss.append(reverse(a[i])+" ");
			else ss.append(reverse(a[i]));
		}
		System.out.println(ss);
	}
	public static StringBuffer reverse(String s) {
		int n = s.length();
		StringBuffer ss2 = new StringBuffer();
		for(int i=n-1;i>=0;i--) {
			ss2.append(s.charAt(i));
		}
		return ss2;
	}

}
