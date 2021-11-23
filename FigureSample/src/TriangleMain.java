
public class TriangleMain {

	public TriangleMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(2,3,4);
		Triangle t2 = new Triangle(4,3,2);
		Triangle t3 = new Triangle(2,3,3);
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		System.out.println(Triangle.isSimilar(t1, t2));
		System.out.println(Triangle.isSimilar(t1, t3));
	}

}
