
public class Human implements Workable,Eatable,Sleepable {
	private String name;
	private boolean isAwake;
	private boolean isWorking;
	private int energyLevel;
	
	public Human(String name) {
		this.name = name;
		this.isAwake = true;
		this.isWorking = false;
		this.energyLevel = 100;
	}

	@Override
	public void sleep() {
		isAwake = false;
		isWorking = false;
		energyLevel  = 100;
		System.out.println(name+ " is Sleeping . Energy Level is : "+energyLevel);
		
	}

	@Override
	public void wakeUp() {
		System.out.println(name+" Woke up refreshed");
	}

	@Override
	public void eat() {
		energyLevel+=30;
		if(energyLevel>100) {
			energyLevel = 100;
		}
		System.out.println(name+" is eating . Energy Level is : "+energyLevel);
		
	}

	@Override
	public void digest() {
		System.out.println(name+" is digesting Food.....");
	}

	@Override
	public void work() {
		if(isAwake && energyLevel>20) {
			isWorking=true;
			energyLevel-=20;
			System.out.println(name + " is Working. Energy level : "+energyLevel);
		}
		else {
			System.out.println(name+"is too tired to work");
		}
		
	}

	@Override
	public void takeBreak() {
		if(isWorking) {
			isWorking = false;
			energyLevel+=10;
			System.out.println(name+" is taking a break. Energy level :"+energyLevel);
		}
		
	}
	
	public void show_status() {
		System.out.println("------"+name+" Status------");
		System.out.println("Awake : "+isAwake);
		System.out.println("Working : "+isWorking);
		System.out.println("Energy : "+energyLevel);
		System.out.println();
	}

}
