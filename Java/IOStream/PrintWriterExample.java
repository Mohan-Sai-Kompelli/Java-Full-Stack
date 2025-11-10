
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		try(PrintWriter out = new PrintWriter("Output.txt")){
			out.print("Hello this is a message written to a file ");
			out.print(" this is another line");
			out.println(false);
			out.println(10.5);
			out.println('a');
			out.write(97); // prints wrt unicode value
			System.out.println(" data written to a file successfully!");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
