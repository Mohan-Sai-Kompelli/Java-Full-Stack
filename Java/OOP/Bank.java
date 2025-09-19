
public class Bank {
double balance;


	public Bank(double b) {
		this.balance = b;
	}
	
	public void dep(double amount) {
		balance  = balance + amount;
		System.out.println("Amount added through raw deposit");
	}
	
	public void dep(double amount , String chequenum) {
		balance = balance + amount ;
		System.out.println("Amount added through check");
	}
	
	public void dep(double amount,String transac_id,String bank_name) {
		balance = balance+amount;
		System.out.println("Amount added Through atm");
	}
	public void show() {
		System.out.println("The current balnce is :: "+balance);
	}
	public static void main(String[] args) {
		Bank bb = new Bank(5000);
		bb.dep(6000);
		bb.dep(1000,"rfyedgydho");
		bb.dep(5000,"yvcywvbcu","SBI");
		bb.show();

	}

}
