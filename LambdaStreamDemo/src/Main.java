import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).
				collect(Collectors.toList());
		//get count of empty string
		long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(strings);
		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).
				collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		System.out.println(count);
		
		Random random = new Random();
		random.ints().limit(4).forEach(System.out::println);
		System.out.println();
		random.ints().limit(5).sorted().forEach(System.out::println);
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).
				distinct().collect(Collectors.toList());
		System.out.println(numbers);
		System.out.println(squaresList);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).
				summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}

}
