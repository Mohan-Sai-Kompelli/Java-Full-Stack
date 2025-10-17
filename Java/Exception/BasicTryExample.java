
public class BasicTryExample {

	public static void main(String[] args) {
//		System.out.println("line -1");
//		int res = 10/0;  /// risky code
//		System.out.println("line -2");
		
		try {
			System.out.println("line -1");
			int res = 10/0;  /// risky code
			System.out.println("line -2");
		}catch(Exception e) {  // we can also write RuntimeException  we can also choose aoirthmetic exception
			// out of all three exceptions
			// exactly matched exception is recommended than 
			System.out.println("Exception caught division by zero");
			// aftetr this line it goes to normal termination
		}
		System.out.println("Program ends Normally");
		
		
		
		try {
			System.out.println("line -1");
			//int res = 10/0;  /// risky code
			int[] a  = {10,20,30};
			System.out.println(a[1]);
			System.out.println(a[5]);
			System.out.println("line -2");
		}catch(ArrayIndexOutOfBoundsException e) {  
			
			System.out.println("Exception caught division by zero");
			// aftetr this line it goes to normal termination
		}
		System.out.println("Program ends Normally");
		
	}

}
