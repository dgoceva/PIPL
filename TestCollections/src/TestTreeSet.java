import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(){  
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 
		System.out.println(set);
	}  
}
