
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Employee emp = new Employee(101,"malli",60000,"Hyderabad");
		// Step 1
		
		String filePath = "emp.txt";
		System.out.println("Employee details before Serialization : ");
		emp.displayEmpDetails();
		
		try(FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(emp);
				System.out.println("Serialized Employee Object  : "+emp);
				System.out.println();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		
		//----------------------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("De-Serialization Process");
		try(FileInputStream fis = new FileInputStream(filePath);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Employee emp1 = (Employee)ois.readObject();
			System.out.println("Employee Details After De-Serialization");
			emp1.displayEmpDetails();
					System.out.println("De-Serialized Employee Object : "+emp1);
				}catch(IOException e) {
					e.printStackTrace();
				}
	
		
	}

}
