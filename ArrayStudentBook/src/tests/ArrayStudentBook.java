package tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ArrayStudentBook implements StudentBook {
	private List<Student> students = new LinkedList<Student>();

	@Override
	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public void removeStudent(Student student) {
		students.remove(student);
	}

	@Override
	public Student findStudent(String name) {
		for (Student s : students) {
			if (s.getName().equals(name))
				return s;
		}
		return null;
	}

	@Override
	public Student findStudent(int id) {
		for (Student s : students) {
			if (s.getId() == id)
				return s;
		}
		return null;
	}

	@Override
	public List<Student> findAllStudent(String name) {
		List<Student> all = new ArrayList<Student>();
		for (Student s : students)
			if (s.getName().equals(name))
				all.add(s);
		return all;
	}

	@Override
	public Collection<Student> getAll() {
		return students;
	}

	@Override
	public int getSize() {
		return students.size();
	}

}
