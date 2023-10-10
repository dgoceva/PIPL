import java.util.Comparator;

public class AgeSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
