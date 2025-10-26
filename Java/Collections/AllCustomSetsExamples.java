
import java.util.TreeSet;

public class AllCustomSetsExamples {

	public static void main(String[] args) {
//		HashSet<Employee> empList1 = new HashSet<Employee>();
//		empList1.add(new Employee(111,"Mohan",98649898899.098,"Vijayawda"));
//		empList1.add(new Employee(100,"M K",98649899.098,"Hyderabad"));
//		empList1.add(new Employee(1,"Mani",923428899.098,"Banglore"));
//		empList1.add(new Employee(000,"Nami",898899.098,"Pune"));
//		empList1.add(new Employee(1,"Robin",432899.098,"Mumbai"));
//		System.out.println(empList1);
//		for(Employee l1:empList1) {
//			System.out.println(l1);
//		}
//	}
	
		TreeSet<Employee> empList1 = new TreeSet<Employee>(new EmpComparator());
		empList1.add(new Employee(111,"Mohan",98649898899.098,"Vijayawda"));
	empList1.add(new Employee(100,"mani",98649899.098,"Hyderabad"));
	empList1.add(new Employee(1,"Mahesh",923428899.098,"Banglore"));
	empList1.add(new Employee(000,"anil",898899.098,"Pune"));
	empList1.add(new Employee(1,"Arvi",432899.098,"Mumbai"));
//	System.out.println(empList1);
	for(Employee l1:empList1) {
		System.out.println(l1);
	}
	
	
	
//	public static void main(String[] args) {
//	HashSet<Employee> empList1 = new HashSet<Employee>();
//	empList1.add(new Employee(111,"Mohan",98649898899.098,"Vijayawda"));
//	empList1.add(new Employee(100,"M K",98649899.098,"Hyderabad"));
//	empList1.add(new Employee(1,"Mani",923428899.098,"Banglore"));
//	empList1.add(new Employee(000,"Nami",898899.098,"Pune"));
//	empList1.add(new Employee(1,"Robin",432899.098,"Mumbai"));
//	System.out.println(empList1);
//	for(Employee l1:empList1) {
//		System.out.println(l1);
//	}
//}

}

}
