package bandit;
/*
 * Всички мъже в градовете стандартно имат два крака, две ръце, две очи и здрав нос. 
 * Те си имат име, кон със съответно име и различен вкус за марка уиски. 
 * Ако някой попита човека за името му, то той ще му го каже. 
 * Също така отговарят за въпроса „какво уиски обичаш да пиеш“. 
 * Понякога обаче хората влизат в престрелки и побой в баровете и се случват инциденти. 
 * Така  е възможно някой да изгуби крайник или око, или пък да осъмне със счупен нос.
 * Задача 2. Моделирайте описания по-горе клас “Villager”.
 */
enum NouseKind {Broken,Healthy} ; 

public class Villager {
	private int legs;
	private int hands;
	private int eyes;
	private NouseKind nouse;
	private String name;
	private String hourse;
	private String whiskey;

	public Villager() {
		super();
		// TODO Auto-generated constructor stub
		legs = 2;
		hands = 2;
		eyes = 2;
		nouse = NouseKind.Healthy;
		name = "";
		hourse = "";
		whiskey = "";
	}

	public Villager(int legs, int hands, int eyes, 
			String name, String hourse, String whiskey) {
		super();
		this.legs = legs;
		this.hands = hands;
		this.eyes = eyes;
		this.nouse = NouseKind.Healthy;
		this.name = name;
		this.hourse = hourse;
		this.whiskey = whiskey;
	}

	public String getName() {
		return name;
	}

	public String getWhiskey() {
		return whiskey;
	}

	public int getLegs() {
		return legs;
	}

	public int getHands() {
		return hands;
	}

	public int getEyes() {
		return eyes;
	}

	public String getHourse() {
		return hourse;
	}

	public void setNouse(NouseKind nouse) {
		this.nouse = nouse;
	}
}
