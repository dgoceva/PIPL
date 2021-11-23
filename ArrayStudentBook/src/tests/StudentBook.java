package tests;

import java.util.Collection;
import java.util.List;

public interface StudentBook {
	void addStudent(Student student);
	void removeStudent(Student student);
	Student findStudent(String name);
	Student findStudent(int id);
	List<Student> findAllStudent(String name);
	Collection<Student> getAll();
	int getSize();
}
