
public class Triangle extends PlainFigure {

	public Triangle(double d1, double d2, double d3) throws TriangleException {
		super(d1, d2, d3);
		// TODO Auto-generated constructor stub
		if (!(d1+d2>d3 && d2+d3>d1 && d1+d3>d2)) {
			throw new TriangleException("Not a triangle exception");
		}
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-getD1())*(p-getD2())*(p-getD3()));
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return getD1()+getD2()+getD3();
	}

	public static boolean isProp(Triangle t1, Triangle t2) {
		return t1.getD1()/t2.getD1()==t1.getD2()/t2.getD2() &&
				t1.getD3()/t2.getD3()==t1.getD1()/t2.getD1();
	}
}
