
public class TestInterface implements Printable {
	@Override
	public void print() {
		// TODO Auto-generated method stub
//		MIN = 10;
		System.out.println(MIN);
	}

	public static void main() {
		Printable d = new TestInterface();
		d.print();
		System.out.println(Printable.MIN);
	}
}
