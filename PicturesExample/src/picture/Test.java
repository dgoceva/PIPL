package picture;

import java.util.*;

public class Test {

	/**
	 * @param args
	 */
	private static Pictures pict;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pict = new Pictures();
		MainMenu();
	}

	private static void MainMenu() {

		Scanner sc = new Scanner(System.in);
		int choice;

		System.out.println("1. Add Picture");
		System.out.println("2. Delete Picture");
		System.out.println("3. Picture Info");
		System.out.println("4. ...");
		System.out.println("5. Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			add();
			break;
		case 2:
			del();
			break;
		case 3:
			info();
			break;
		}
		sc.close();
	}

	private static void add() {
		Picture p = new Picture();
		try {
			pict.add(p);
		} catch (PictureException e) {

		}
	}

	private static void del() {
		System.out.print("Input id ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		pict.delete(id);
		sc.close();
	}

	private static void info() {
		System.out.print("Input author ");
		Scanner sc = new Scanner(System.in);
		String aName = sc.next();
		pict.print(aName);
		sc.close();
	}

}
