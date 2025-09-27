
public class Main {
	
	
	public static void main(String[] args) {
		String s1 = new String("Mohan");
		String s2 = new String("mohan");
		String s3 = new String("Mohan");
		String s4 = "Mohan";
		String s5 = s1;
		// reassigning garbage collector
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		
		
		
	}

}
