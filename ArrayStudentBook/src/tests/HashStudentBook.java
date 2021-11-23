package tests;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class HashStudentBook implements StudentBook {
	private Map<Integer, Student> studentById = new HashMap<Integer, Student>();
	private Map<String, List<Student>> studentByName = new HashMap<String, List<Student>>();
	private int size = 0;
	
	public HashStudentBook() {
	}
	
	@Override
	public void addStudent(Student student) {
		Student prev = studentById.put(student.getId(), student);
		List<Student> nameList = null;
		if ( (nameList = studentByName.get(student.getName())) == null) {
			nameList = new LinkedList<Student>();
		}
		nameList.add(student);
		studentByName.put(student.getName(), nameList);
		if (prev == null)
			size++;
	}
	
	@Override
	public void removeStudent(Student student) {
		Student removed = studentById.remove(student.getId());
		for (Student s : studentByName.get(student.getName())) {
			if (s.getId() == student.getId()) {
				studentByName.get(student.getName()).remove(s);
			}
		}
		if (removed != null)
			size--;
	}
	
	@Override
	public Student findStudent(String name) {
		return studentByName.get(name).get(0);
	}
	
	@Override
	public Student findStudent(int id) {
		return studentById.get(id);
	}
	
	@Override
	public List<Student> findAllStudent(String name) {
		return studentByName.get(name);
	}
	
	@Override
	public Collection<Student> getAll() {
		return studentById.values();
	}
	
	@Override
	public int getSize() {
		return size;
	}
}
