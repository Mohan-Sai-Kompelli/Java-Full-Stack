
public class Employee {
	String name;
	double salary;
	
	public void setDetails(String n,double s) {
		name = n;
		salary = s;
	}
	
	public double calcHRA() {
		return salary*0.20;
	}
	
	public double calcDA() {
		return salary*0.10;
	}
	
	public double grossSal() {
		return salary+calcHRA()+calcDA();
	}

	

	}

