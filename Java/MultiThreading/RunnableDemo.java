
public class RunnableDemo {
	
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		// we have to cvall tunnable class and add that creaed object into clas and then use it throug thresa\ad 
		
		Thread t = new Thread(r);
		//t.run();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
