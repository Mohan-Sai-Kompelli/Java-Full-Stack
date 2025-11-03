
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("output.txt"))){
			String line;
			line = br.readLine();
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
			
//			while((line = br.readLine())!=null) {
//				
//			}   another way of writing the above code
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
