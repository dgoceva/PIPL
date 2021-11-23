package classes;

import java.util.Scanner;

// vseki edin class zapochva s modeficator za dostap v tozi sluchai toi pokazva koi moje da e dostapen do classa 
// class - danni i metodi koito gi obrabot
// klassSedemnad.. - tipovo ime, no ne zadelqm pamet. 
//promenliva ot tip class se naricha obekt ili instanciq na classa 
// kogato pravim edin class trqbva da zadadem negovite danni- chetem zadachata - dannite se definirat kakto se definirat promenlivi. 
final class KlasSedemnadeseti {

	public String model; // modifikator za dostap, skriti danni - dostap samo ot
							// tozi klas; obiknovenno dannite se pravqt private
	private double cena; // ako propusnem modifatora - ima dostap v ramkite na
							// paketa, private pozvolqva samo v tekushtoq klas,
							// public navsqkade i ima protected - koeto
							// osigorqva dostap do naslednicite na class-a
	private short godina;

	// syzadaite construktor pod podrazbirane
	// metod imeto na koito savpada s meto na klasa i nqma tip na vrashtanata
	// stoinost
	public KlasSedemnadeseti() // konstruktora nqma danni pod podrazbirane ---
								// ako ne syzdadem nikakav konstruktor tozi
								// konstruktor se sazdava pod podrazbirane
	// ako nie syzdadem tozi pod podrazbirane izchezva, konstruktora sluji za
	// inicializirane na dannite
	{
		this("", 0, (short) 2000); // izvikvane na parametri ot drug konstruktor
									// ; (short) tova e nasilstvena smqna na
									// tipa
	}

	public KlasSedemnadeseti(String model, double cena, short godina) {
		// syzdavame konstruktos s parametri
		this.model = model;
		this.cena = cena;
		this.godina = godina; // this is kliuchova duma pokazvashta koq e
								// tekushtiq obekt ili instanciq, izpolzvame go
								// zashtoto imenata na promenlivite savpadat s
								// likalnite promenlivi . THis pokazva che
								// rabotim s promenlivite ot classa

	}

	public KlasSedemnadeseti(KlasSedemnadeseti c) {
		model = c.model;
		cena = c.cena;
		godina = c.godina;
	}

	public static KlasSedemnadeseti input() {// vrashta
		Scanner sc = new Scanner(System.in);

		System.out.println("Input model: ");
		String model = sc.nextLine();
		System.out.println("Input price: ");
		double price = sc.nextDouble();
		System.out.println("Input year: ");
		short year = sc.nextShort();
		// return new Car() - moje i taka --- shte s eizvika konstruktora bez
		// parametri
		return new KlasSedemnadeseti(model, price, year); // taka se izvikva
															// konstruktora, ne
															// moje da go
															// izvikame bez
															// new!!

	}

	// predefiniraite metoda w String ... pravim nov class CarMain
	// definirane na metod
	public String toString() {
		return "[model = " + model + ", cena = " + cena + ", godina= " + godina
				+ "]";
		// @Override - anotaciq - pokazva kakvo iskam da pravq, toi sledi dali
		// savpada tochno v roditelskiq clas
	}

	// sledvashtata chast ot zadachata se sazdava masiv ot koli ... sazdavame
	// nov klas s metodi ..
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public short getGodina() {
		return godina;
	}

	public void setGodina(short godina) {
		this.godina = godina;
	}

}
