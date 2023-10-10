import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new Name("Ivan", "Ivanov");
		Name n2 = new Name("Ivan","Ivanov");
		Name n3 = new Name("Petyr","Ivanov");
		Map<Name,Integer> persons = new HashMap<Name,Integer>();
		
		persons.put(n1, 35);
		persons.put(n2, 35);
		persons.put(n3, 40);
		
		for(Map.Entry<Name, Integer> person : persons.entrySet()) {
			System.out.println(person.getKey()+"-->"+person.getValue());
		}
		
		Set<Map.Entry<Name,Integer>> set = persons.entrySet();
		Iterator<Map.Entry<Name,Integer>> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Name, Integer> data = iterator.next();
			System.out.println(data.getKey()+"-->"+data.getValue());
		}
		Name n4 = new Name("Ivan", "Ivanov");
		System.out.println(persons.get(n4));
	}

}
