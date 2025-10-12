
public interface Vehicle {
	int MAX_SPEED = 200;
	String Fuel_Type = "PETROL";
	
	
	public abstract void start();
	// by default it is considwered as public abstract void stop();
	void stop();
	void accelerate();
	void brake();
	int getCurrentSpeed();
	
}
