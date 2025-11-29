
public class PersonA implements Runnable{

	BankAccount account;
	public PersonA(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		account.withdraw(Thread.currentThread().getName(), 7000);
	}

	
}
