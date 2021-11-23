package StudentExample;

import java.util.ArrayList;

public class StudentGroup {
	ArrayList<StudentInfo> group;

	public ArrayList<StudentInfo> getGroup() {
		return group;
	}

	public void setGroup(ArrayList<StudentInfo> group) {
		this.group = group;
	}

	public StudentGroup() {
		// TODO Auto-generated constructor stub
		group = new ArrayList<StudentInfo>();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void addStudent(StudentInfo st) {
		group.add(st);
	}

	private void deleteStudent(int index) {
		group.remove(index);
	}

	public void deleteByName(String ime) {
		deleteStudent(findStudent(ime, 0));
	}

	public void deleteByFNom(int fnom) {
		int index = findStudent(fnom);
		if (index > -1)
			deleteStudent(index);
	}

	public void deleteByNameAll(String ime) {
		int index = 0;
		do {
			index = findStudent(ime, index);
			if (index > -1)
				deleteStudent(index);
		} while (index != -1);
	}

	public int findStudent(int fnom) {
		for (int i = 0; i < group.size(); i++) {
			if (group.get(i).getFnom() == fnom) {
				return i;
			}
		}
		return -1;
	}

	public int findStudent(String ime, int index) {
		for (int i = index; i < group.size(); i++) {
			if (group.get(i).getIme() == ime) {
				return i;
			}
		}
		return -1;
	}
}
