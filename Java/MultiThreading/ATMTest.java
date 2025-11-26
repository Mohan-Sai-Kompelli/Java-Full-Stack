
public class ATMTest {
	
	public static void main(String[] args) {
		BankAccount acc = new BankAccount(10000);
		PersonA a = new PersonA(acc);
		PersonB b = new PersonB(acc);
		PersonC c = new PersonC(acc);
		
		Thread t1 = new Thread(a,"User A");
		Thread t2 = new Thread(b,"User B");
		Thread t3 = new Thread(c,"User C");
		t1.start();
		t2.start();
		t3.start();
	}

}
