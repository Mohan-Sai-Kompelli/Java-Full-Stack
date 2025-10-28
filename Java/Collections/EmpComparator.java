
import java.util.Comparator;

public class EmpComparator implements Comparator<Employee>{
	
	public int compare(Employee e1,Employee e2) {
		// if we taske obj1 and obj2 we need to do type casting for employee object so we used generics to solve and call them directly
		//return e1.compareTo(e2);
		// we are telling it to compare but we didnt say which field to compare in object that is why
		// the above line is showing error
		//return e1.getName().compareTo(e2.getName());
		
		
		//return -Integer.compare(e1.getId(),e2.getId());
		
		return -Double.compare(e1.getSalary(),e2.getSalary());
	}
	
}
