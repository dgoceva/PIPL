package bandit;

/*
 * Бандитите са специален вид мъже – те имат някои допълнителни качества. 
 * По-точно носят задължителния револвер с определен брой патрони, кратко бандитско име и парична награда за главата им. 
 * Не съществува бандит, чийто нос да не е бил счупен при някой бой в бар. 
 * Понякога бандитите влизат в престрелка с други бандити, но честта ги задължава винаги да се бият един срещу друг, 
 * а не по много. 
 * Задача 3. Напишете клас “Villain”, който моделира написаното в миналия параграф. Методът за престрелка “Skrmish” 
 * да бъде статичен за класа, като подадените му параметри да бъдат двама бандити, които ще се дуелират. 
 * Те, от своя страна, трябва да извикат методите си “Shoot”, които действат по следния начин:
 * •	Ако бандита няма патрони, то метода връща 0;
 * •	Ако бандита има патрони, то метода връща произволно число от 0 до 100.
 * Престрелката протича по следния начин – двамата бандити стрелят и се сравняват числата, които са генерирали методите. 
 * По-голямото число печели. Ако то от своя страна е по-голямо от 70, то противника е убит, престрелката се прекратява 
 * и на екрана се изписва името на победителя. Ако не е по-голямо от 70, то престрелката продължава, докато не се 
 * свършат патроните и на двамата противници. Ако патроните свършат и няма убит, то на екрана се изписва, 
 * че няма победител.
 */

public class Villain extends Villager {
	private int cartridges;
	private String shortName;
	private double price;

	public Villain() {
		super();
		// TODO Auto-generated constructor stub
		setNouse(NouseKind.Broken);
		cartridges = 0;
		shortName = "";
		price = 0;
	}

	public Villain(int legs, int hands, int eyes, String name,
			String hourse, String whiskey, int cartridges, String shortName,
			double price) {
		super(legs, hands, eyes, name, hourse, whiskey);
		setNouse(NouseKind.Broken);
		// TODO Auto-generated constructor stub
		this.cartridges = cartridges;
		this.shortName = shortName;
		this.price = price;
	}

	public int shoot() {
		if (cartridges > 0) {
			return (int) (Math.random() * 100);
		} else
			return 0;
	}

	public static void Skirmish(Villain a, Villain b) {
		int ca = a.shoot();
		int cb = b.shoot();
		
		System.out.println("First shoot: "+ca);
		System.out.println("Second shoot: "+cb);

		if (ca > cb) {
			if (ca > 70) {
				System.out.println("Finished. " + a.shortName
						+ " is the winner.");
				return;
			}
		} else {
			if (cb > 70) {
				System.out.println("Finished. " + b.shortName
						+ " is the winner.");
				return;
			}
		}
		a.cartridges = (a.cartridges - ca < 0) ? 0 : (a.cartridges - ca);
		b.cartridges = (b.cartridges - cb < 0) ? 0 : (b.cartridges - cb);

		System.out.println("First cartridge: "+a.cartridges);
		System.out.println("Second cartridge: "+b.cartridges+'\n');

		
		if (a.cartridges == 0 && b.cartridges == 0) {
			System.out.println("Finished. No winner!");
			return;
		}

		Skirmish(a, b);
	}
}
