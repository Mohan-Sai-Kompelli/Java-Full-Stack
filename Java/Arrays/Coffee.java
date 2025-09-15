
public class Coffee {
	String type;
	String size;
	boolean Sugar;
	
	public Coffee(String type,String size,boolean Sugar) {
		this.type = type;
		this.size = size;
		this.Sugar = Sugar;
	}
	public void display() {
		System.out.println("Type: "+type);
		System.out.println("Size "+size);
		System.out.println("Sugar: "+Sugar);
	}
	
	public static void main(String[] args) {
		
		Coffee cof = new Coffee("Latte","Small",false);
		cof.display();
		Coffee cof2 = new Coffee("Cappucino","Medium",true);
		cof2.display();
		Coffee cof3 = new Coffee("Expresso","Large",false);
		cof3.display();

	}

}
