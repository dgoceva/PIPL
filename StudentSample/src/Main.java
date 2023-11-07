import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(123,"John");
		List<Student> students = List.of(student);
		Group groupOfStudents = new Group(1,"CSE",2,students);
		System.out.println(groupOfStudents);
	}

}
