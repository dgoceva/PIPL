package classes;

import java.util.Scanner;

//създаване на масив
public class Cars {
	private KlasSedemnadeseti[] data;
	private int len;

	public Cars() {
		data = null; // inicializirame masiva s null
		len = 0;
	}

	// zadelqme pamet syzdavame nov konstruktor

	public Cars(int MAX) {
		data = new KlasSedemnadeseti[MAX];
		len = 0;

	}

	public void Add(KlasSedemnadeseti c) { // metod
		if (len == data.length) {
			throw new ExceptionInInitializerError(" The array is full: ");
		}
		data[len++] = new KlasSedemnadeseti(c);

	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inport size of the array; ");
		int MAX = sc.nextInt();
		if (MAX < 1) {
			throw new ExceptionInInitializerError("the .....");
		}
		data = new KlasSedemnadeseti[MAX];

		for (int i = 0; i < MAX; i++) {
			Add(KlasSedemnadeseti.input());

		}
	}

	@Override
	public String toString() {
		// return "Cars [data = " + Array.toString(data) + ", len=" + len + "]";
		String result = "Cars [data=[";
		for (int i = 0; i < len; i++) {
			result += data[i] + "]";
			result += (i == len - 1) ? "], len=" + len + "]" : ",";

		}
		return result;
	}

	public void delete(String model) {
		int index = 0;
		for (int i = 0; i < len; i++) {
			if (!data[i].getModel().equals(model)) {
				data[index++] = data[i];
			}

		}
		len = index;
	}
}
