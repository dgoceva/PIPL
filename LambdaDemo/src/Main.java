import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a,b)->a+b;
		MathOperation mult = (a,b)->a*b;
		MathOperation div = (a,b)->{return a/b;};
		
		
		Set<String> mySet = new HashSet<>(Arrays.asList("One","Two","Three"));
		List<Integer> data =Arrays.asList(1,2,3,4,5);
		List<String> words = Arrays.asList("One","Two","Three","Zero");
		int[] nums = new int[] {1,2,3,4};
		Map<Integer,String> values = Map.of(0, "Zero",1, "One",2, "Two",3, "Three");
//		Map<Integer, String> values = new HashMap<Integer, String>();
//		values.put(0, "Zero");
//		values.put(1, "One");
//		values.put(2, "Two");
//		values.put(3, "Three");
		
		System.out.println(add.operation(10,15));
		System.out.println(mult.operation(10,15));
		System.out.println(div.operation(100,15));
		
		data.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.print(t+"\t");
			}
		});
		System.out.println();
		data.forEach(t->System.out.print(t+"\t"));
		System.out.println();
		
		Consumer<Map.Entry<Integer, String>> action = entry->{
			System.out.println(entry.getKey()+": "+entry.getValue());
		};
		values.entrySet().forEach(action);
		values.forEach((k,v)->System.out.println(k+": "+v));
		
		mySet.forEach(s->System.out.print(s+"\t"));
		System.out.println();
		
		Arrays.stream(nums).forEach(x->System.out.print(x+"\t"));
		System.out.println();
		
		IntConsumer intAction = i->System.out.println(i);
		Arrays.stream(nums).forEach(intAction);
		
		words.forEach(System.out::println);
		words.sort(Comparator.naturalOrder());
		words.forEach(System.out::println);
		words.sort(Comparator.reverseOrder());
		words.forEach(System.out::println);
	}

}
