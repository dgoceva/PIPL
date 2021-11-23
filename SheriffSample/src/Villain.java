import java.util.Random;

public class Villain extends Villager {
	private String banditName;
	private int cartridge;
	private int price;
	public String getBanditName() {
		return banditName;
	}
	public void setBanditName(String banditName) {
		this.banditName = banditName;
	}
	public int getCartridge() {
		return cartridge;
	}
	public void setCartridge(int cartridge) {
		this.cartridge = cartridge;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Villain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int Shoot(){
		Random result = new Random();
		if (cartridge==0)
			return 0;
		else {
			cartridge--;
			return result.nextInt(101);
		}
	}

	public static void Skrmish(Villain a, Villain b){
		int resA;
		int resB;
		do {
			resA = a.Shoot();
			resB = b.Shoot();
		} while(resA<=70 && resB<=70 && (a.getCartridge()>0 || b.getCartridge()>0));
		
		if (resA>resB && resA>70)
			System.out.println(a.getBanditName()+" is the winner");
		else if (resB>resA && resB>70)
			System.out.println(b.getBanditName()+" is the winner");
		else 
			System.out.println("No winner");	
	}
	public Villain(String banditName, int cartridge, int price, String name, String horse, String whisky) {
		super(name,horse,whisky);
		this.banditName = banditName;
		this.cartridge = cartridge;
		this.price = price;
	}
	
}
