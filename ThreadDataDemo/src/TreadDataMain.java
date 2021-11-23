import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.LongBinaryOperator;
import java.util.stream.IntStream;

public class TreadDataMain {
	private static AtomicInteger atomicInt = new AtomicInteger(0);
	private static LongAdder adder = new LongAdder();

	private static ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
	
	public TreadDataMain() {
		// TODO Auto-generated constructor stub
	}

    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
            
        }
    }

    // increment the number concurrently in a thread-safe manor without synchronization
	public static void example1() {

		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 1000)
		    .forEach(i -> executor.submit(atomicInt::incrementAndGet));

		stop(executor);

		System.out.println(atomicInt.get());
	}
	
	// updateAndGet() accepts a lambda expression in order to perform 
	// arbitrary arithmetic operations upon the integer
	public static void example2() {
		atomicInt.set(0);
		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 1000)
		    .forEach(i -> {
		        Runnable task = () ->
		            atomicInt.updateAndGet(n -> n + 2);
		        executor.submit(task);
		    });

		stop(executor);

		System.out.println(atomicInt.get());
	}
	
	// sum up all values from 0 to 1000 concurrently
	public static void example3() {
		atomicInt.set(0);
		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 1000)
		    .forEach(i -> {
		        Runnable task = () ->
		            atomicInt.accumulateAndGet(i, (n, m) -> n + m);
		        executor.submit(task);
		    });

		stop(executor);

		System.out.println(atomicInt.get());
	}
	
	public static void example4() {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 1000)
		    .forEach(i -> executor.submit(adder::increment));

		stop(executor);

		System.out.println(adder.sumThenReset());
	}
	
	public static void example5() {
		LongBinaryOperator op = (x, y) -> 2 * x + y;
		LongAccumulator accumulator = new LongAccumulator(op, 1L);

		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 10)
		    .forEach(i -> executor.submit(() -> accumulator.accumulate(i)));

		stop(executor);

		System.out.println(accumulator.getThenReset());
	}
	
	public static void example6() {
		map.put("foo", "bar");
		map.put("han", "solo");
		map.put("r2", "d2");
		map.put("c3", "p0");

		map.forEach((key, value) -> System.out.printf("%s = %s\n", key, value));
		
		String result = map.putIfAbsent("c3", "p1");
		System.out.println(result); 
		
		result = map.getOrDefault("hi", "there");
		System.out.println(result); 
		
		map.replaceAll((key, value) -> "r2".equals(key) ? "d3" : value);
		System.out.println(map.get("r2")); 
		
		map.compute("foo", (key, value) -> value + value);
		System.out.println(map.get("foo")); 
		
		map.merge("foo", "boo", (oldVal, newVal) -> newVal + " was " + oldVal);
		System.out.println(map.get("foo"));
	}
	
	// put -Djava.util.concurrent.ForkJoinPool.common.parallelism=10 
	// in to Run->Run Configuration->Arguments->VM arguments
	public static void example7() {
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("foo", "bar");
		map.put("han", "solo");
		map.put("r2", "d2");
		
		map.forEach(1, (key, value) ->
	    System.out.printf("key: %s; value: %s; thread: %s\n",
	        key, value, Thread.currentThread().getName()));

		String result = map.search(1, (key, value) -> {
		    System.out.println(Thread.currentThread().getName());
		    if ("foo".equals(key)) {
		        return value;
		    }
		    return null;
		});
		System.out.println("Result: " + result);
		
		result = map.searchValues(1, value -> {
		    System.out.println(Thread.currentThread().getName());
		    if (value.length() > 3) {
		        return value;
		    }
		    return null;
		});

		System.out.println("Result: " + result);

		result = map.reduce(1,
			    (key, value) -> {
			        System.out.println("Transform: " + Thread.currentThread().getName());
			        return key + "=" + value;
			    },
			    (s1, s2) -> {
			        System.out.println("Reduce: " + Thread.currentThread().getName());
			        return s1 + ", " + s2;
			    });

			System.out.println("Result: " + result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		example1();
//		example2();
//		example3();
//		example4();
//		example5();
//		example6();
		example7();
	}

}
