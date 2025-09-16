
public class Boxdemo {
	double height;
	double width;
	double depth;
	
	public Boxdemo(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public void volume() {  ///instance method without parameters and return;
	
		System.out.println("Box Voulme is : ");
		System.out.println(height*depth*width);
		
	}
	
	public void setDim(double h,double w,double d) { // with parameters and without return
		double  volume = h*w*d;
		System.out.println("Volume is : "+volume);
	
	}
	
	public double vol() { /// with return type and without parameters
		return height*width*depth;
	}
	
	public double calcVol(double h1,double d1,double w1) {  // with return type and parameters
		return h1*w1*d1;
	}
	

	public static void main(String[] args) {
		Boxdemo b1 = new Boxdemo(3.0,4.0,5.0);
		b1.volume();
		b1.setDim(10.0, 20.0,30.0);
		Boxdemo b2 = new Boxdemo(4.0,5.0,6.0);
		System.out.println("Box 2 volume is : "+b2.vol());
		Boxdemo b3 = new Boxdemo(3.0,4.0,5.0);
		System.out.println("Box calculated volume is : "+b3.vol());

	}

	
}
