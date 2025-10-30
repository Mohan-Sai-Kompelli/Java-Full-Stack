
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListCustomExample {
	
	public static void main(String[] args) {
		ArrayList<Student> studentL1 = new ArrayList<Student>();
		studentL1.add(new Student(1,"Mohan",21));
		studentL1.add(new Student(2,"Mohan Sai",22));
		studentL1.add(new Student(3,"Mohan Sai Kompelli",22));
		studentL1.add(new Student(4,"MK",17));
		studentL1.add(new Student(5,"PK",40));
		studentL1.add(new Student(6,"DK",48));
		System.out.println(studentL1);
		
		System.out.println("------------------------------------------------------------------------");
		
		
		System.out.println();
		LinkedList<Student> studentL2 = new LinkedList<Student>();
		studentL2.add(new Student(1,"Mohan",21));
		studentL2.add(new Student(2,"Mohan Sai",22));
		studentL2.add(new Student(3,"Mohan Sai Kompelli",22));
		studentL2.add(new Student(4,"MK",17));
		studentL2.add(new Student(5,"PK",40));
		studentL2.add(new Student(6,"DK",48));
		System.out.println(studentL2);
		studentL2.addFirst(new Student(7,"Varun",22));
		System.out.println(studentL2);
		
		System.out.println("------------------------------------------------------------------------");
		
		
		System.out.println();
		Vector<Student> studentL3 = new Vector<Student>();
		studentL3.add(new Student(1,"Mohan",21));
		studentL3.add(new Student(2,"Mohan Sai",22));
		studentL3.add(new Student(3,"Mohan Sai Kompelli",22));
		studentL3.add(new Student(4,"MK",17));
		studentL3.add(new Student(5,"PK",40));
		studentL3.add(new Student(6,"DK",48));
		System.out.println(studentL3);
		
		System.out.println("enumeration");
		Enumeration<Student> e  = studentL3.elements();
		while(e.hasMoreElements()) {
			Student s = e.nextElement();
			System.out.println(s);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		
		System.out.println();

		Iterator<Student> itr = studentL1.iterator();
		while(itr.hasNext()) {
			//itr.next();
			// wea re priting student objects
			Student s1 = itr.next();
			if(s1.getId()==1) {
				itr.remove();
			}
			System.out.println(s1);
			
		}
		System.out.println("After removal of s1 we will ");
		System.out.println(studentL1);
		
	}

}
