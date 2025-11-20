
import java.util.Scanner;

public class Vowels_And_Consonants_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		count_vow_con(s);
	}
	public static void count_vow_con(String s) {
		int v_cnt=0;
		int c_cnt=0;
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') && Character.isLetter(c)){
				v_cnt++;
			}	
			else if(Character.isLetter(c)){
				c_cnt++;
			}
			else {
				continue;
			}
		}
		System.out.println("The count of the voewls in the String is : "+v_cnt);
		System.out.println("The count of the consnants in the String is : "+c_cnt);
	}
}
