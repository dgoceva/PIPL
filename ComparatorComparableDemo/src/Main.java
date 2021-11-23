import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

// Comparable <-> Comparator
// Comparable.compateTo(Object o) <-> Comparator.compare(Object o1, Object o2)
// java.lang <-> java.util
// Collection.sort(List) <-> Collection.sort(List,Comparator)
// signle sorting sequence <-> multiple sorting sequence

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentComparable> students = new ArrayList<StudentComparable>();
		students.add(new StudentComparable(101, "Ivan Ivanov", 5.45f));
		students.add(new StudentComparable(202, "Lili Ivanova", 5.55f));
		students.add(new StudentComparable(303, "Georgi Petrov", 5.65f));

		Collections.sort(students);
		for (StudentComparable st : students) {
			System.out.println(st);
		}

		ArrayList<Student> group = new ArrayList<Student>();
		group.add(new Student(101, "Ivan Ivanov", 5.45f));
		group.add(new Student(202, "Lili Ivanova", 5.55f));
		group.add(new Student(303, "Georgi Petrov", 5.65f));

		Collections.sort(group, new SortByName());
		System.out.println("Sort by name");
		for (Student st : group) {
			System.out.println(st);
		}
		Collections.sort(group, new SortByNumber());
		System.out.println("Sort by number");
		for (Student st : group) {
			System.out.println(st);
		}

		List<Student> list = Arrays.asList(new Student(101, "Ivan Ivanov", 5.55f),
				new Student(202, "Lili Ivanova", 5.55f), new Student(303, "Georgi Petrov", 5.65f));
		Collections.sort(list,new SortByMark()
				.thenComparing(new SortByName()));
		System.out.println(list);
		
		HashMap<StudentComparable, Integer> table = new HashMap<StudentComparable, Integer>();
		table.put(new StudentComparable(101, "Ivan Ivanov", 5.45f), 1);
		table.put(new StudentComparable(202, "Lili Ivanova", 5.55f),2);
		table.put(new StudentComparable(303, "Georgi Petrov", 5.65f),3);
		System.out.println(table);
		
		TreeMap<StudentComparable, Integer> sorted = 
				new TreeMap<StudentComparable, Integer>(table);
		System.out.println(sorted);
	}

}
