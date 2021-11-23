package StudentExample;

import java.util.Date;
import java.util.Random;


public class StudentTest {

	private static final String[] NAMES = { "Asq", "Ivo", "Peter", "Miro",
		"Dani", "Jon", "Petko", "Gancho", "Dancho", "Toni", "Naso",
		"Silviq", "Branimir", "Asen", "Stanislav", "Petq", "Mariana",
		"Svetlio", "Kremena", "Hristina", "Alexandra", "Emiliq", "Natasha",
		"Hasan", "Muncho", "Diqna", "Justin", "Sofi", "Maria", "Kremena",
		"Ianko", "Gunio", "Vadim", "Ari", "Julia", "Daniela" };
	private static final double[] MARKS = { 3.4, 5.2, 4.3, 3.5,
		4.5, 5.1, 3.2, 3.5, 4.4, 5.5, 5.8,
		4.1, 4.6, 3.7, 3.6, 3.8, 4,
		5, 5.4, 5.6, 3.5, 4.2, 4.3,
		4, 3, 3.9, 4.6, 5.1, 3.2, 4.8,
		4.5, 6, 5.2, 3.2, 4.2, 5 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		StudentGroup arrayBook = new StudentGroup();
		StudentHashMap hashBook = new StudentHashMap();
		StudentInfo s = null;
		int i = 0;
		long start = 0, end = 0;

		System.out.println("Starting adding into array... ");
		start = System.currentTimeMillis();
		for (i = 0; i < 1000000; i++) {
			s = new StudentInfo(i, NAMES[r.nextInt(NAMES.length)],
					MARKS[r.nextInt(MARKS.length)]);
			arrayBook.addStudent(s);
		}
		end = System.currentTimeMillis();
		System.out.println("Finished adding ... in " + (end - start) + " millis");

		System.out.println("Starting adding into hash... ");
		start = new Date().getTime();
		for (i = 0; i < 1000000; i++) {
			s = new StudentInfo(i, NAMES[r.nextInt(NAMES.length)],
					MARKS[r.nextInt(MARKS.length)]);
			hashBook.addStudent(s);
		}
		end = new Date().getTime();
		System.out.println("Finished adding ... in " + (end - start) + " millis");


		System.out.println("Starting array... ");
//		start = new Date().getTime();
		start = System.nanoTime();
		arrayBook.deleteByNameAll("Daniela");
//		end = new Date().getTime();
		end = System.nanoTime();
//		System.out.println("Finished array... in " + (end - start) + " millis");
		System.out.println("Finished array... in " + (end - start) + " nanos");

		System.out.println();

		System.out.println("Starting hash... ");
		start = System.nanoTime();
		hashBook.deleteByNameAll("Daniela");
		end = System.nanoTime();
		System.out.println("Finished hash... in " + (end - start) + " nanos");
	}
}
