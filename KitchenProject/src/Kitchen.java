public class Kitchen {

	private String name;
	private WeekMenu menu;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WeekMenu getMenu() {
		return menu;
	}

	public void setMenu(WeekMenu menu) {
		this.menu = menu;
	}

	public Kitchen() {
		// TODO Auto-generated constructor stub
	}

	public Kitchen(String name, WeekMenu menu) {
		super();
		this.name = name;
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Kitchen [name=" + name + ", menu=" + menu + "]";
	}

	public void add(Kid kid) {
		
	}
}
