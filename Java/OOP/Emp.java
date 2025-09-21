
public class Emp {
private int emp_id;
private String name;
private double sal;

public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	if(sal>0) this.sal = sal;
	else {
		System.out.println("Give positive Numbers ");
	}
	
}

public Emp(int e,String n,double s) {
	this.emp_id = e;
	this.name= n;
	this.sal = s;
}

public void disp_emp_info() {
	System.out.println("The ID number of employee : "+emp_id);
	System.out.println("The Name of the employee : "+name);
	System.out.println("The Salary of employee : "+sal);
	
}

public static void main(String[] args) {
	Emp e  =new Emp(123,"Mohan Sai Kompelli",999877656);
	e.disp_emp_info();
}

}
