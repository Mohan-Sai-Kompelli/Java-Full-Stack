
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
		String filePath = "jfs42fos.txt";
		try(FileInputStream fis = new FileInputStream(filePath)){
			int byteData;
			while((byteData = fis.read())!=-1) {
				System.out.print((char)byteData);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
