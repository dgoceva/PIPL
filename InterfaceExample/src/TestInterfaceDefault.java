
public class TestInterfaceDefault {
	public static void main() {
		Drawable1 d = new Square();
		d.draw();
		d.msg();
//		 Drawable1.msg();
		d = new Rectangle1();
		d.draw();
		d.msg();
	}
}

interface Drawable1 {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class Square implements Drawable1 {
	public void draw() {
		System.out.println("drawing square");
	}

	public void msg() {
		System.out.println("hello");
	}
}

class Rectangle1 implements Drawable1{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle1");
	}
	
}
