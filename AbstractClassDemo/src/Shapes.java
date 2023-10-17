
class Circle extends GraphicObject {

	Circle(int x, int y){
		super(x,y);
	}
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle.draw():->("+x+","+y+")");

	}

	@Override
	void resize() {
		// TODO Auto-generated method stub
		System.out.println("Circle.resize()");
	}

}

class Rectangle extends GraphicObject {

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle.draw()->("+x+","+y+")");
	}

	@Override
	void resize() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle.resize()");
	}
	
}