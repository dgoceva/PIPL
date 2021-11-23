package figure;

public abstract class PlainFigure implements Figure {
	public final double d1,d2,d3;
	
	public PlainFigure(double d1, double d2, double d3){
		this.d1 = Math.min(d1, Math.min(d2, d3));
		this.d3 = Math.max(d1, Math.max(d2, d3));
		this.d2 = d1+d2+d3-this.d1-this.d3;
	}
	public void print(){
		System.out.println("d1= "+d1+", d2= "+d2+", d3= "+d3);
	}
	public boolean equal(Figure f){
		PlainFigure fig = (PlainFigure)f;
		return d1==fig.d1 && d2==fig.d2 && d3 == fig.d3;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
