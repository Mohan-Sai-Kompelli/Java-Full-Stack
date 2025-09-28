
public class Test {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.property();
		p1.marry();
		Child c1 = new Child();
		c1.property();
		c1.marry();
		
		Parent p2 =new Child();
		p2.property();
		p2.marry();//    DYNAMIC METHOD DISPATCH
// why we will get child here 
// when it is overridin child specific methods are excecuted
		// if it is IN overloading then the parent class method wouldd be printed
		
	}
}
