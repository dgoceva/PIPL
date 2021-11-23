
public abstract class PlainFigure implements Figure {

	public double d1;
	public double d2;
	public double d3;
	
	@Override
	public boolean equals(Figure obj) {
		// TODO Auto-generated method stub
		return getArea()==((PlainFigure)obj).getArea();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "PlainFigure [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}

	public PlainFigure(double d1, double d2, double d3){
		this.d1 = Math.min(Math.min(d1, d2), d3);
		this.d3 = Math.max(Math.max(d1, d2), d3);
		this.d2 = d1+d2+d3 - this.d1 - this.d3;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
