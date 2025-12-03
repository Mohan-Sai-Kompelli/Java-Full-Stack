
public class PersonC implements Runnable{
	
	BankAccount account;
	public PersonC(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.withdraw(Thread.currentThread().getName(), 4000);
	}

}
