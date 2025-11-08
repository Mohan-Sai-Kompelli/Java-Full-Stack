
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) throws IOException{
		String filePath = "jfs42fos.txt";
		String content = "Writing a data using fileoutput Stream .\n"
				+" java programming is easy.\n when it? you make practice";
		try(FileOutputStream fos = new FileOutputStream(filePath)) {
			
			byte[] data = content.getBytes();
			fos.write(data);
			System.out.println("file created and written using FileOutput");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
