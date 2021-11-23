
public abstract class PlainFigure implements Figure {

	public double d1;
	public double d2;
	public double d3;
	
	public PlainFigure() {
		// TODO Auto-generated constructor stub
	}
	public PlainFigure(double d1, double d2, double d3) {
		this.d1 = Math.min(Math.min(d1, d2), d3);
		this.d3 = Math.max(Math.max(d1, d2), d3);
		this.d2 = d1+d2+d3-this.d1-this.d3;
	}

	@Override
	public String toString() {
		return "PlainFigure [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}
	@Override
	public boolean equals(Figure f) {
		// TODO Auto-generated method stub
//		return getArea()==((PlainFigure)f).getArea();
		if (!(f instanceof PlainFigure)) {
			return false;
		}
		PlainFigure temp = (PlainFigure)f;
		return d1==temp.d1 && d2==temp.d2 && d3==temp.d3;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
