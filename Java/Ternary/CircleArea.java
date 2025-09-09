
public class CircleArea {

	public static void main(String[] args) {
		
		System.out.println("Enter the circle radius : ");
		Scanner sc =new Scanner(System.in);
		int radius = sc.nextInt();
		double  area = 3.14*radius*radius;
		System.out.println(area);
		sc.close();
	}

}
