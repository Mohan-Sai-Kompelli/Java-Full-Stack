
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filePath = "jfs42bos.txt";
		String content = "Welcome to java programming language. \n"
				+" java programming was developed by James gosling in 1995. \n"
				+ " java is a powerful programming language .\n"
				+ " it is strongly typed";
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))){
			byte[] data = content.getBytes();
			bos.write(data);
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

}
