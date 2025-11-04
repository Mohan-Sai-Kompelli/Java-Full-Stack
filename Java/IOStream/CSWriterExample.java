
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSWriterExample {
	
	public static void main(String[] args) throws FileNotFoundException {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("malli",27,"Hyde"));
		people.add(new Person("sunny",22,"Bng"));
		people.add(new Person("bunny",37,"vjy"));
		try(PrintWriter out  = new PrintWriter("person.csv")){
			out.print("name,age,city");
			out.println();
			for(Person p:people) {
				out.print(p.toCSV());
				out.println();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
