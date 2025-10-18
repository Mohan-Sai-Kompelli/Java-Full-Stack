
public class FinallyExample {
	
	public static void main(String[] args) {
		try {
			System.out.println("In try Block");
			int res = 10/0;
			System.out.println("result : "+res);
		}catch(NullPointerException e ) { // if we take arithmetic then it will print catch as well
			
			System.out.println(" in catch block ");
		}
		finally {
			System.out.println("In finally Block this always excecutes");
		}
		System.out.println("After try-catch-finally");
	}

}
