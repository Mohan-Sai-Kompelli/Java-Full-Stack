
public class BoxingUnboxingDemo {
	
	public static void main(String[] args) {
		int a = 10;
		Integer b = a;// primitive to wrapper   that is called as boxing
		System.out.println("Primitive Type: "+a);
		System.out.println("Wrapper Object: "+b);
		
		Double d = 10.5;  //wrapper
		double x = d;   // wrapper class object to primitive   this is called as unboxing
		System.out.println("Unboxing Wrapper: "+d);
		System.out.println("Unboxing Primitive: "+x );
		
		
	}

}
