
public class DailyMenu {
	private Dish breakfast;
	private Dish lunch;
	private Dish dinner;
	//private Dish[] menu;
	public Dish getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(Dish breakfast) {
		this.breakfast = breakfast;
	}
	public Dish getLunch() {
		return lunch;
	}
	public void setLunch(Dish lunch) {
		this.lunch = lunch;
	}
	public Dish getDinner() {
		return dinner;
	}
	public void setDinner(Dish dinner) {
		this.dinner = dinner;
	}
		
	public DailyMenu() {
		
	}
	public DailyMenu(Dish breakfast, Dish lunch, Dish dinner) {
//		super();
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
	public boolean equals(Object obj){
		if (obj==null)
			return false;
		if (!(obj instanceof DailyMenu))
			return false;
		byte cnt=0;
		if (breakfast.equals(obj))
			cnt++;
		if (lunch.equals(obj))
			cnt++;
		if (dinner.equals(obj))
			cnt++;
		return cnt>=2;
	}
	
	public String toString() {
		return "["+breakfast+", "+lunch+", "+dinner+"]";
	}
}
