
public class BankAccount {

	double balance;
	public BankAccount(double balance) {
		this.balance = balance;
	}
	public synchronized void withdraw(String user,double amount) {
		System.out.println(user+" Trying to withdraw: "+amount);
		// checking if the balance is available
		
		if(balance>amount) {
			System.out.println(user+" is processing withdrawl..... ");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			balance -=amount;
			System.out.println(user+" Completed withdrawl. Remaining balance : "+balance);
		}
		else {
			System.out.println(user+" insufficient funds ! available balance "+balance);
		}
		System.out.println("-------------------------------------");
	}
	

}
