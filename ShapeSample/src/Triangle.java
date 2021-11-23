
public class Triangle extends PlainFigure {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return d1+d2+d3;
	}

	public Triangle(double d1, double d2, double d3){
		super(d1,d2,d3);
		try {
			if (d1<0 || d2<0 || d3<0 || d1+d2<=d3 || d2+d3<=d1 || d1+d3<=d2)
				throw new TriangleException("This is not a triangle");
			} catch (TriangleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static boolean similar(Triangle t1, Triangle t2){
		return (t1.d1/t2.d1==t1.d2/t2.d2 && t1.d1/t2.d1==t1.d3/t2.d3);
	}
}
