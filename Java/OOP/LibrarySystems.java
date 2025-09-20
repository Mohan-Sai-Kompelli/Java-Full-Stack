
public class LibrarySystems {

	public static void main(String[] args) {
		Books b = new Books("Java","James Gosling",false);/// the 
		// problem here is if we take false in the user input hera as false and if we decalre true in the constructor then we wil take the default value still as true which is wrong
		// and we should tell the user in advance whether we have the book to urselves or not
		// because others dont know whether we have the book or ot rigfht
		
		//Books b1 = new Books("Python","Guideo Van");
		b.display();
		b.borrow_book();
		b.borrow_book();
		b.display();
		

	}
	

}
