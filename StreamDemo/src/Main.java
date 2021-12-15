import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

// filter, map, reduce, find, match, sort
// forEach(), forEachOrder()
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		main1();
//		main2();
//		main3();
//		main4();
//		main5();
//		main6();
//		main7();
//		main8();
//		main9();
//		main10();
//		main11();
//		main12();
//		main13();
		main14();
	}

	public static void main1() {
		List<String> words = Arrays.asList("I","like","Java","programming");
		
		String word = words.stream().findFirst().get();
		System.out.println(word);
		
		Stream<String> letters = Arrays.stream(new String[] {"a","b","c"});
		System.out.printf("There are %d letters%n",letters.count());
		
		String day = "Monday";
		IntStream istr = day.codePoints();
		String s = istr.filter(e->e!='n').collect(StringBuilder::new, 
				StringBuilder::appendCodePoint, StringBuilder::append).toString();
		System.out.println(s);
	}
	public static void main2() {
		IntStream integers = IntStream.rangeClosed(1, 20);
		System.out.println(integers.average().getAsDouble());
		
		DoubleStream doubles = DoubleStream.of(2.3,4.5,2.44,72.1);
		doubles.forEachOrdered(e->System.out.print(e+" "));
		System.out.println();
		
		LongStream longs = LongStream.range(10, 30);
		System.out.println(longs.count());
	}
	public static void main3() {
		Stream<String> colors = Stream.of("red","yellow","blue","green");
		String color = colors.skip(2).findFirst().get();
		System.out.println(color);
		
		Stream<Integer> nums = Stream.of(3,4,5,6,7);
		int maxVal = nums.max(Comparator.naturalOrder()).get();
		System.out.println(maxVal);
	}
	public static void main4() {
		Stream<Integer> ints = Stream.iterate(5, n->n*2).limit(10);
		ints.forEach(System.out::println);
		System.out.println();
		
		Stream.generate(new Random()::nextDouble)
			.map(e->(e*10))
			.limit(5)
			.forEach(System.out::println);
	}
	public static void main5() {
		Path file = Paths.get("data.txt");
		try {
			Stream<String> stream = Files.lines(file);
			stream.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main6() {
		List<String> words = Arrays.asList("I","like","Java","programming");
		Iterator<String> iter = words.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		words.stream().forEach(System.out::println);
	}
	public static void main7() {
		IntStream nums = IntStream.rangeClosed(0, 25);
		int[] vals = nums.filter(e->e>15).toArray();
		System.out.println(Arrays.toString(vals));
		
		nums = IntStream.rangeClosed(0, 25);
		nums.filter(e->e%2==0).forEach(System.out::println);
	}
	public static void main8() {
		IntStream nums = IntStream.rangeClosed(0, 25);
		nums.skip(3).limit(5).forEach(System.out::println);
	}
	public static void main9() {
		IntStream nums = IntStream.of(4,3,-11,-5,12,7,0);
		List<Car> cars = Arrays.asList(new Car("Audi",55000,2021),new Car("Mercedes",120000,2020),
				new Car("Tesla",130000,2020),new Car("Ford",25000,2021));
		
		nums.boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		cars.stream().sorted(Comparator.comparing(Car::getPrice)).forEach(System.out::println);
	}
	public static void main10() {
		IntStream nums = IntStream.of(1,1,1,3,4,2,2,6,3,4,4,7);
		int[] a = nums.distinct().toArray();
		System.out.println(Arrays.toString(a));
	}
	public static void main11() {
		Stream<String> words = Stream.of("i","like","java","code");
		words.map(word->Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase())
			.forEach(System.out::println);
		
		IntStream nums = IntStream.of(1,2,3,4,5,6,7,8,9,10);
		int[] squares = nums.map(e->e*e).toArray();
		System.out.println(Arrays.toString(squares));
	}
	public static void main12() {
		IntStream nums = IntStream.of(1,2,3,4,5,6,7,8,9,10);

		int maxVal = nums.max().getAsInt();
		System.out.println(maxVal);

		nums = IntStream.of(1,2,3,4,5,6,7,8,9,10);
		int product = nums.reduce((a, b)->a*b).getAsInt();
		System.out.printf("The product is: %d%n",product);
	}
	public static void main13() {
		List<Car> cars = Arrays.asList(new Car("Audi",55000,2021),new Car("Mercedes",120000,2020),
				new Car("Tesla",130000,2020),new Car("Ford",25000,2021));

		List<String> names = cars.stream().map(Car::getBrand)
				.filter(name->name.contains("e"))
				.collect(Collectors.toList());
		
		for(String name : names) {
			System.out.println(name);
		}
	}
	public static void main14() {
		List<String> items = Arrays.asList("pen","book","pen","coin","book","desk",
				"book","pen","book","coin");
		
		Map<String, Long> result = items.stream().collect(
				Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		for(Map.Entry<String, Long> entry: result.entrySet()) {
			String key = entry.getKey();
			Long value = entry.getValue();
			
			System.out.format("%s: %d%n", key,value);
		}
	}
}
