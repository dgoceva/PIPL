
public class Rectangle implements IComparable {
	private double a;
	private double b;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return a*b;
	}

	public boolean isEqual(IComparable c) {
		// TODO Auto-generated method stub
//		return IComparable.super.isEqual(c);
		if (IComparable.isNull(c) || !(c instanceof Rectangle)) {
			return false;
		}
		Rectangle r = (Rectangle)c;
		return getArea()==r.getArea();
	}

	@Override
	public IComparable less(IComparable c) {
		// TODO Auto-generated method stub
		if (IComparable.isNull(c) || !(c instanceof Rectangle))
			return null;
		return (getArea()<(((Rectangle)c).getArea())) ? this : c;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}

}
