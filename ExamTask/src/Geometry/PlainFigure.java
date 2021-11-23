package Geometry;

public abstract class PlainFigure implements Figure {

	public boolean equals(Figure fig){
		PlainFigure pfig = (PlainFigure)fig;
		return d1==pfig.d1 && d2==pfig.d2 && d3==pfig.d3;
	}
	
	public void print() {
		System.out.println("d1="+d1+"\td2="+d2+"\td3=\n");
	}
	
	public final double d1, d2, d3;
	public PlainFigure(double d1, double d2, double d3) {
		this.d1 = Math.min(d1, Math.min(d2, d3));
		this.d3 = Math.max(d1, Math.max(d2, d3));
		this.d2 = Math.min(this.d1, this.d3);
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
