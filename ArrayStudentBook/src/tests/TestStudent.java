package tests;

import java.util.Date;
import java.util.Random;

public class TestStudent {
	private static final String[] NAMES = {
		"Asq", "Ivo", "Peter", "Miro", "Dani", "Jon", "Petko", "Gancho", "Dancho", "Toni", "Naso",
		"Silviq", "Branimir", "Asen", "Stanislav", "Petq", "Mariana", "Svetlio", "Kremena", "Hristina",
		"Alexandra", "Emiliq", "Natasha", "Hasan", "Muncho", "Diqna", "Justin", "Sofi", "Maria", "Kremena",
		"Ianko", "Gunio", "Vadim", "Ari", "Julia", "Daniela"
	};
	
	public static void main(String[] args) {
		Random r = new Random();
		StudentBook arrayBook = new ArrayStudentBook();
		StudentBook hashBook = new HashStudentBook();
		Student s = null;
		int i = 0;
		for (i = 0; i < 2000000; i++) {
			s = new Student(i, NAMES[r.nextInt(NAMES.length)]);
			arrayBook.addStudent(s);
			hashBook.addStudent(s);
		}
		
		long start = 0, end = 0;
		
		System.out.println("Starting array... ");
		start = new Date().getTime();
		arrayBook.findAllStudent("Daniela");
		end = new Date().getTime();
		System.out.println("Finished array... in " + (end - start) + " millis");
		
		System.out.println();
		
		System.out.println("Starting hash... ");
//		start = new Date().getTime();
		start = System.nanoTime();
		hashBook.findAllStudent("Daniela");
//		end = new Date().getTime();
		end = System.nanoTime();
//		System.out.println("Finished hash... in " + (end - start) + " millis");
		System.out.println("Finished hash... in " + (end - start) + " nanos");
	}
}
