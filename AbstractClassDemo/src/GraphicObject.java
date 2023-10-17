
abstract class GraphicObject {
	int x;
	int y;
	
	public GraphicObject(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public GraphicObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract void draw();
	abstract void resize();
}
