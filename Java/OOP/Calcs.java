
public class Calcs {

	public static void square(double size) {
		System.out.println("The perimeter for square is  : "+ (4*size));
	}
	
	public static void rect(double length,double breadth) {
		System.out.println("The perimeter for rectangle : "+(2*(length+breadth)));
	}
	
	public static void circle(double radius) {
		System.out.println("The perimeter of circle : "+(2*3.14*radius));
	}
	
	public static void triangle(double a, double b, double c) {
		System.out.println("The perimeter of triangle : "+(a+b+c));
	}
	
	public static void para(double base,double size) {
		System.out.println("The perimeter for parallelogram is : "+(2*(base+size)));
	}
	public static void main(String[] args) {
		square(4.0);
		rect(5.0,6.0);
		circle(23.272);
		triangle(45.0,56.0,78.0);
		
	}

}
