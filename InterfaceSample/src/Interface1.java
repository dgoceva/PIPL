
public interface Interface1 {
	final static int x=3;
}

interface Interface2 {
	final static int x=11;
}

class Implemented implements Interface1,Interface2 {
	void print() {
//		System.out.println("x="+x);
		System.out.println("x="+Interface2.x);
	}
}