
import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		// we need to convert object to integer
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
//		if(i1<i2) {// obj 1<obj2 // 10<20 so -ve
//			return -10;  // or -i1
//		}
//		else {
//			if(i1>i2) {
//				return 1;// or +i1
//			}
//			else {
//				return 0;  //or 0
//			}
//		}
//		// if we want custon order hen we need to change the condition va,ues 
		
		
		
		// -------------we can write in single line as well
		return -i1.compareTo(i2);
	}
}
