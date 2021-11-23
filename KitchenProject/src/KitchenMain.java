
interface Iprint{
	void print();
}
public class KitchenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyMenu dish = new DailyMenu(new Dish("krem",(short)130),
				new Dish("supa",(short)200), 
				new Dish("musaka",(short)120));
		System.out.println(dish);
		WeekMenu menu = new WeekMenu();
		menu.setMenu(new DailyMenu[] {dish,dish,dish,dish,dish,dish,dish});
		System.out.println(menu);
		
		Iprint i=()->System.out.println("Hello");
		i.print();
	}
}
