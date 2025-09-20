
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setDetails("Mohan Sai", 997717618);
		double grossSalary = emp.grossSal();
		
		System.out.println("Employee Name : "+emp.name);
		System.out.println("Employee Salary is : "+emp.salary);
		System.out.println("HRA allowance is : "+emp.calcHRA());
		System.out.println("DA allowance is : "+emp.calcDA());
		System.out.println("The Grosss Salary is : "+grossSalary);
		
		
		

	}

}
