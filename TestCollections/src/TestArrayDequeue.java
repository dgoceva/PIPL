import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDequeue {
	public static void main() {  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str);  
		}  
	}  
}
