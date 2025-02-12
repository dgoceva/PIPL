
public class MultipleInterfaces implements Multiple {

	public static void main() {
		Multiple obj = new MultipleInterfaces();
		obj.draw();
		obj.multiple();
		obj.print();
		obj.show();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing...");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing...");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing...");
	}

}

interface Multiple extends Printable,Drawable,Showable {
	default void multiple() {
		System.out.println("Multiple Interface Extends");
	}
}