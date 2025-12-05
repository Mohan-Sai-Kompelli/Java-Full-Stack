
public class PriorityDemo {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		// to check priority of the main thread then see below line of code
		System.out.println(Thread.currentThread().getPriority());
		
		Priority p = new Priority();
		Thread th = new Thread(p);
		th.start();
		//System.out.println(Thread.currentThread().getName());
		System.out.println(th.getName());
		System.out.println(th.currentThread().getPriority());
		// the above line of code is to get to know the priority of the thread here
		th.setName("Codegnan");
		th.setPriority(Thread.MAX_PRIORITY); // thisd line of code is to define priorituy ti the threasd
		System.out.println(th.getName()+"      "+ th.getPriority());
	}

	// a thread which has highest priority will be excecuted first
	
}
