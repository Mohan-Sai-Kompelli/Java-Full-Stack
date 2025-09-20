
public class Book {

	String title;
	String author;
	boolean is_avail=true;
	
	public Book(String t,String a,boolean is) {
	this.title = t;
	this.author =a;
	this.is_avail = is;
	}
	
	public void borrow_book() {
		System.out.println("Book Already Borrowed");
		is_avail = false;
	}
	
	public void return_book() {
		System.out.println("Book was not Borrowed");
		is_avail = true;
	}
	
	public void display() {
		System.out.println("The title of book is: "+title);
		System.out.println("The author of book is : "+author);
		System.out.println("Book Availability : "+is_avail);
	}
	
	
}
