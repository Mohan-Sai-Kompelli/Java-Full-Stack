
public class LibrarySystem {

	public static void main(String[] args) {
		Book b = new Book("48 Laws of Power","Robert Green",false);
		b.display();
		b.borrow_book();
		b.borrow_book();
		b.display();
		Book b1 = new Book("Art of war","Sun Tzu",true);
		b1.display();
		b.return_book();
		b.display();
	}
}
