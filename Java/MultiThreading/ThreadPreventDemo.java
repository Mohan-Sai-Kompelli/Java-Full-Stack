
public class ThreadPreventDemo {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		Thread t = new Thread(my);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Class");
		}
	}

}
