import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = Arrays.asList(
				new Employee(1,"A","B",34),
				new Employee(4,"C","D",30),
				new Employee(3,"B","A",31),
				new Employee(6,"B","A",30),
				new Employee(5,"B","C",31),
				new Employee(2,"D","C",25)				
				);
		Collections.sort(list,new FirstNameSorter());
		System.out.println(list);
		Collections.sort(list,new FirstNameSorter()
				.thenComparing(new LastNameSorter())
				.thenComparing(new AgeSorter())
				);
		System.out.println(list);
	}

}
