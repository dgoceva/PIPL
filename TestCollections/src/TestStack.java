import java.util.Iterator;
import java.util.Stack;

public class TestStack {
	public static void main(){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		System.out.println(stack.pop());  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}
