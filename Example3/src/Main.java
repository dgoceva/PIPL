
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relatable rect1 = new RectanglePlus(3,4);
		Relatable rect2 = new RectanglePlus(4,3);
		Relatable rect3 = new RectanglePlus(4,4);
		Relatable tri1 = new TrianglePlus(3,4);
		Relatable tri2 = new TrianglePlus(4,3);

		System.out.println("Rec1 > Rec2: "+rect1.isLargerThan(rect2));
		System.out.println("Rec1 > Rec3: "+rect1.isLargerThan(rect3));
		System.out.println("Tri1 > Tri2: "+tri1.isLargerThan(tri2));
		System.out.println("Rec1 > Tri1: "+rect1.isLargerThan(tri1));
	}
}
