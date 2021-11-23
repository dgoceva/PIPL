
public class Triangle extends PlainFigure {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(double d1, double d2, double d3) {
		// super(d1, d2, d3);
		// TODO Auto-generated constructor stub
		try {
			if (d1 <= 0 || d2 <= 0 || d3 <= 0) {
				throw new TriangleException("d1, d2, d3 must not be 0");
			} else if (d1 + d2 <= d3 || d2 + d3 <= d1 || d1 + d3 <= d2) {
				throw new TriangleException("Triangle error");
			} else {
				this.d1 = d1;
				this.d2 = d2;
				this.d3 = d3;
			}
		} catch (TriangleException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return d1 + d2 + d3;
	}

	@Override
	public boolean equals(Figure f) {
		// TODO Auto-generated method stub
		if (!(f instanceof Triangle)) {
			return false;
		}
		Triangle t = (Triangle)f;
		return getArea()==t.getArea();
	}

	public static boolean isSimilar(Triangle t1, Triangle t2) {
		return t1.d1/t2.d1==t1.d2/t2.d2 && 
				t1.d2/t2.d2==t1.d3/t2.d3;
	}
}
