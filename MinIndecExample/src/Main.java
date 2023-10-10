
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int min=0,index=0;
		Int min = new Int();
		Int index = new Int();
		minIndex(new int[] {1,2,3,5,1,2,1,2},min,index);
		System.out.println("min("+index.getI()+")="+min.getI());
	}

	public static void minIndex(int[] data, Int min, Int index) {
		index = new Int();
		index.setI(0);
		for(int i=1;i<data.length;i++) {
			if (data[index.getI()]>=data[i]) {
				index.setI(i);
			}
		}
		min.setI(data[index.getI()]);
		System.out.println("min("+index.getI()+")="+min.getI());
	}
}

class Int {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
