import java.util.Arrays;

public class WeekMenu {
	private DailyMenu[] menu;
	
	public WeekMenu() {
		this((byte)7);
	}
	
	public WeekMenu(byte count) {
		if (count>0 && count<8)
			menu = new DailyMenu[count];
	}
	
	public DailyMenu[] getMenu() {
		return menu;
	}
	
	public void setMenu(DailyMenu[] menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "WeekMenu [menu=" + Arrays.toString(menu) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(menu);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeekMenu other = (WeekMenu) obj;
		if (!Arrays.equals(menu, other.menu))
			return false;
		return true;
	}
	
}
