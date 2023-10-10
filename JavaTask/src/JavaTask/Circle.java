package JavaTask;

public class Circle implements Movable {

	Point center;
	int radius;
	
	@Override
	public void moveUp(int pixels) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDown(int pixels) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveLeft(int pixels) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveRight(int pixels) {
		// TODO Auto-generated method stub

	}

	public boolean isInside(Point p) {
		return (p.x-center.x)*(p.x-center.x)+(p.y-center.y)*(p.y-center.y)<=radius*radius;
	}
}
