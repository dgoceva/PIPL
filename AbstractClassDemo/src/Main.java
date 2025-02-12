
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicObject shape = new Circle();
		shape.draw();
		shape.resize();
		shape.moveTo(20, 10);
		shape.draw();
		shape = new Rectangle(3,4);
		shape.draw();
		shape.resize();
	}

}
