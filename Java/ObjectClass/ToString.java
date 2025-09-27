
public class ToString {
	String name;
	int age;
	public ToString(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
//	public String toString() {
//		return "name" + name + "Age: "+age;
//	}
	// it will be complex if we want to generate for multiple variables
	// we can generate custom toString using SDE
	
	
	public static void main(String[] args) {
		ToString s1 = new ToString("Mohan",21);
		ToString s2 = new ToString("Mohan Sai",22);
		ToString s3 = new ToString("Mohan",21);
		ToString s4 = s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		
		
		System.out.println(s1);
		System.out.println(s2);
		// when we print object by default it will excecute toString method
		// if we dont use it, it will generate itsn address

		
		System.out.println(s1.toString());
		// if we override toString method it will overide default toString by object
		
		
		
		
	}

	@Override
	public String toString() {
		return "ToString [name=" + name + ", age=" + age + "]";
	}
	
}
