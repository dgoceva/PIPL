import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Name,Student> hashTable = new HashMap<>();
		hashTable.put(new Name("Ivan"), new Student("Ivan","Ivanov",20));
		hashTable.put(new Name("Petyr"), new Student("Petyr","Ivanov",22));
		hashTable.put(new Name("Ivan"), new Student("Ivan","Petrov",19));
		
		System.out.println(hashTable.toString());
		
		TreeMap<Name, Student> sorted = new TreeMap<>(hashTable);
		System.out.println(sorted);
		sorted.put(new Name("Ivan"), new Student("Ivan","Dimitrov",23));
		System.out.println(sorted);
	}

}
