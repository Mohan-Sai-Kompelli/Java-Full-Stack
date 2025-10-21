
public class SingleCatchExample {

	public static void main(String[] args) {
		try {
			String txt = null;
			// when any operation is being performed on null then it will cause null ptr exception
			int len = txt.length();
		}catch(NullPointerException e) {
			System.out.println("Error : trying to use null reference");
			System.out.println("Exception message : "+e.getMessage());
			// only description will be printed for this command
			e.printStackTrace();
			// this command prints exception name,description and location.
			// this is used to print the exception information
		}
	}
}
