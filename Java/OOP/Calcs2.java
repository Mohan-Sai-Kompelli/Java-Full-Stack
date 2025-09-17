
public class Calcs2 {

		public void square(double size) {
			System.out.println("The area for square is  : "+ (size*size));
		}
		
		public void rect(double length,double breadth) {
			System.out.println("The area for rectangle : "+((length*breadth)));
		}
		
		public void circle(double radius) {
			System.out.println("The area of circle : "+(radius*3.14*radius));
		}
		
		public static void triangle(double a, double b) {
			System.out.println("The area of triangle : "+(0.5*a*b));
		}
		
		public static void para(double base,double size) {
			System.out.println("The area for parallelogram is : "+((base+size)));
		}
		
		public static void trapezoid(double a, double b,double height) {
			System.out.println("The area of trapezoid : "+(0.5*(a+b)*height));
		}
		
		
		public static void main(String[] args) {
			Calcs2 c = new Calcs2();
			c.square(4.0);
			c.rect(5.0,6.0);
			c.circle(23.272);
			triangle(45.0,56.0);
			para(56.0,78.0);
			trapezoid(5.6,78.56,67.5);
		}


	}

