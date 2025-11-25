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
		System.out.println(deque);
		deque.addFirst("First");
		deque.addLast("Last");
		System.out.println(deque);

		System.out.println(deque.removeFirst());
		System.out.println(deque.remove());
		System.out.println(deque.removeLast());
		System.out.println(deque.poll());
		System.out.println(deque.pop());
	}  
}
