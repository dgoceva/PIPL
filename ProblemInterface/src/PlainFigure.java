
public abstract class PlainFigure implements Figure {
	public final double d1;
	public final double d2;
	public final double d3;
	
	public PlainFigure(double d1, double d2, double d3) {
		this.d1 = Math.min(d1, Math.min(d2,d3));
		this.d3 = Math.max(d1, Math.max(d2,d3));
		this.d2 = d1+d2+d3-this.d1-this.d3;
	}
	@Override
	public boolean equals(Figure f) {
		if (f instanceof PlainFigure) {
			PlainFigure pf = (PlainFigure)f;
			return d1==pf.d1 && d2==pf.d2 && d3==pf.d3;
		}
		return false;
	}
	@Override
	public void print() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "PlainFigure [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}
	public abstract double getArea();
	public abstract double getPerimeter();	
}
