
public class InterfaceDemoMain {

	public InterfaceDemoMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(2,3,4);
		Triangle t2 = new Triangle(2,3,5);
		Triangle t3 = new Triangle(4,2,3);
		Rectangle r1 = new Rectangle(2,3);
		
		System.out.println("t1 is equal to t2: "+t1.isEqual(t2));
		System.out.println("t1 is equal to t3: "+t1.isEqual(t3));
		System.out.println("t3 is equal to r1: "+t3.isEqual(r1));
		System.out.println("Less (t1,t2): "+t1.less(t2));
	}

}
