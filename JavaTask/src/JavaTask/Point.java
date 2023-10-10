package JavaTask;

public class Point implements Movable {

	int x;
	int y;
	
	@Override
	public void moveUp(int pixels) {
		// TODO Auto-generated method stub
		for(;y<pixels;++y) {
			print();
		}
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
	
	public void print() {
		System.out.println("("+x+", "+y+")");
	}

}
