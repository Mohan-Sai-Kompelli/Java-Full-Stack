
public class Books {

	String title;
	String author;
	boolean is_avail;
	
	public Books(String t,String a,boolean is_avail) {
	this.title = t;
	this.author =a;
	this.is_avail = true; ///when we are declaring default value we dont need to mention in the constructor
	 
	}
	
	
//	public Books(String t,String a,boolean is_avail) {
//		this.title = t;
//		this.author =a;
//		this.is_avail = true; ///when we are declaring default value we dont need to mention in the constructor
//		 
//		}
	
	
	
	public void borrow_book() {
		if(is_avail) {
			is_avail = false;
			System.out.println(title+"Has been borrowed");
		}
		else {
			System.out.println(title+" is already borrowed - Not available");
		}
		
	}
	
	public void return_book() {
		if(!is_avail) {
			is_avail = true;
			System.out.println(title+"Has been returned");
		}
		else {
			System.out.println(title+" was not borrowed - cannot return");
		}
	}
	
	public void display() {
		System.out.println("The title of book is: "+title);
		System.out.println("The author of book is : "+author);
		System.out.println("Book Availability : "+(is_avail?"Yes":"No"));
		System.out.println("---------------------------------------------------------");
	}
	
	
}
