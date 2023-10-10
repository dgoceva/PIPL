
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Triangle t1=new Triangle(3, 4, 5);
			Triangle t2=new Triangle(4, 5, 3);
			t1.print();
			t2.print();
			System.out.println("S(t1)="+t1.getArea());
			System.out.println("S(t2)="+t2.getArea());
			System.out.println("P(t1)="+t1.getPerimeter());
			System.out.println("P(t2)="+t2.getPerimeter());
			System.out.println("IsEquals: "+t1.equals(t2));
			System.out.println("Is proportional: "+
					Triangle.isProportional(t1, t2));
		}catch (TriangleException t) {
			System.out.println(t);
		}
	}

}
