
public class Human {

	private String name = "Mohan";
	private int age = 22;   // if we keep private qwe can't use them in anoter class
	// we can access them using methods
	//to initialize or see the private variables we do by using special methods called getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
