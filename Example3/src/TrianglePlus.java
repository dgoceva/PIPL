
public class TrianglePlus implements Relatable {

	private int a;
	private int ha;
	
	public double getArea() {
		return a*ha/2.;
	}
	
	public TrianglePlus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrianglePlus(int a, int ha) {
		super();
		this.a = a;
		this.ha = ha;
	}

	@Override
	public int isLargerThan(Relatable other) {
		// TODO Auto-generated method stub
		if (other instanceof TrianglePlus) {
			TrianglePlus t = (TrianglePlus)other;
			if (this.getArea()<t.getArea()) {
				return -1;
			} else if (this.getArea()>t.getArea()) {
				return 1;
			}else {
				return 0;
			}
		}else {
			throw new TypeNotPresentException("TrianglePlus", null);
		}
	}

}
