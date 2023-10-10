
public class Triangle implements IComparable {

	private double a;
	private double b;
	private double c;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		IPerimeter perimeter = (()->(a+b+c));
		double p = perimeter.getPerimeter()/2;

		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	@Override
	public boolean isEqual(IComparable c) {
		// TODO Auto-generated method stub
//		return IComparable.super.isEqual(c);
		if (IComparable.isNull(c) || !(c instanceof Triangle)) {
			return false;
		}
		Triangle t = (Triangle)c;
		return getArea()==t.getArea();
	}

	@Override
	public IComparable less(IComparable c) {
		// TODO Auto-generated method stub
		if (IComparable.isNull(c) || !(c instanceof Triangle)) {
			return null;
		}
		Triangle t = (Triangle)c;
		return (getArea()<t.getArea()) ? this : t;
	}

	@Override
	public String toString() {
		return "[a= "+a+", b= "+b+", c= "+c+"]";
	}
	
}
