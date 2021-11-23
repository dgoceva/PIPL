
public class TestInterfaceStatic {
	public static void main() {
		Drawable2 d = new RoundRectangle();
		d.draw();
		System.out.println(Drawable2.cube(3));
		System.out.println(RoundRectangle.cube(3));
	}
}

interface Drawable2 {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class RoundRectangle implements Drawable2 {
	public void draw() {
		System.out.println("drawing round rectangle");
	}
	public static int cube(int x) {
		return 24;
	}
}
