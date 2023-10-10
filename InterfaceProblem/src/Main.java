
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Triangle t1 = new Triangle(1,3,5);
			Triangle t2 = new Triangle(5,12,13);
			t1.print();
			t2.print();
			System.out.println(t1.equals(t2));
			System.out.println(Triangle.isProp(t1,t2));
		} catch(TriangleException e) {
			System.err.println(e.getMessage());
		}
	}

}
