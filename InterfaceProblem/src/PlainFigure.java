
public abstract class PlainFigure implements Figure {

	private double d1;
	private double d2;
	private double d3;
	
	public PlainFigure(double d1, double d2, double d3) {
		super();
		this.d1 = Math.min(d1,Math.min(d2,d3));
		this.d3 = Math.max(d3,Math.max(d1,d2));
		this.d2 = d1+d2+d3-(this.d1+this.d3);
	}

	@Override
	public boolean equals(Figure fig) {
		// TODO Auto-generated method stub
		if (fig instanceof PlainFigure) {
			PlainFigure pfig = (PlainFigure)fig;
			return d1==pfig.getD1() && d2==pfig.getD2() && d3==pfig.getD3();
		}
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("[ d1="+d1+", d2="+d2+", d3="+d3+" ]");
	}

	abstract double getArea();
	
	abstract double getPerimeter();
	
	public double getD1() {
		return d1;
	}

	public void setD1(double d1) {
		this.d1 = d1;
	}

	public double getD2() {
		return d2;
	}

	public void setD2(double d2) {
		this.d2 = d2;
	}

	public double getD3() {
		return d3;
	}

	public void setD3(double d3) {
		this.d3 = d3;
	}

}
