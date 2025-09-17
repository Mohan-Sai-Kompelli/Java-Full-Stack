
public class Marks {
	String name;
	int[] arr;
	
	public void setDetails(String n,int[] m) {
		name =n;
		arr = m;
	}
	
	public int calctot() {
		int total = 0;
		for(int a:arr) {
			total+=a;
		}
		return total;
	}
	public double calcavg() {
		return calctot()/arr.length;
	}
	
	public void displayDet() {
		System.out.println("Student name : "+name);
		System.out.println("Total marks :"+calctot());
		System.out.println("Average Marks : "+calcavg());
		
		
	}
	
	public static void main(String[] args) {
		Marks mk = new Marks();
		mk.setDetails("Mohan",new int[] {35, 73, 23,23,43});
		
		////   OR      ////////

		///int[] m = new int[] {35, 73, 23,23,43};
		///mk.setDetails("Mohan",m);
		
		
		mk.displayDet();
		
	}

	

}
