
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		isPanagram(s);
	}
	public static void isPanagram(String s) {
		s=s.toLowerCase();
		Set<Character> h = new HashSet<>();  
		for(char c : s.toCharArray()) {              // to convert string to char and also usedto compare as welle specific char in a string
			if(c>='a' || c<='z') {
				h.add(c);
			}
		}
		if(h.size()==26) {
			System.out.println("It is a Panagram");
		}
		else {
			System.out.println("It is not a Panagram");
		}
	}
}
 
