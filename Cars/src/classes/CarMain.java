package classes;

import java.util.Scanner;

// glavnata programa 
public class CarMain {

	public static void main(String[] args) {
		// KlasSedemnadeseti kola = KlasSedemnadeseti.input();
		// System.out.println(kola);

		Cars koli = new Cars();
		koli.input();
		System.out.println(koli);
		Scanner sc = new Scanner(System.in);
		System.out.println("Model ");
		String model = sc.nextLine();
		koli.delete(model);
		System.out.println(koli);

	}

}
