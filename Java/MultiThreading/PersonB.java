
public class PersonB implements Runnable{
	BankAccount account;
	public PersonB(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.withdraw(Thread.currentThread().getName(), 5000);
	}
}
