import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new Name(new String("Ivan"),"Georgiev","Ivanov");
		Name n2 = new Name("Ivan","Georgiev","Ivanov");
		Name n3 = new Name("Ivan","Petrov","Ivanov");
		
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
		System.out.println(n1.equals(n3));
		System.out.println(n3.equals(n2));
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		
		Map<Name,Integer> map = new HashMap<Name,Integer>();
		map.put(n1, 1);
		map.put(n2, 2);
		map.put(n3, 3);
		Name n4 = new Name("Ivan","Georgiev","Ivanov");
		System.out.println(map.containsKey(n4));
		map.put(n4, 4);
		
		Iterator<Entry<Name, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Name, Integer> data = iter.next();
			System.out.println(data.getKey()+"-->"+data.getValue());
		}
	}

}
