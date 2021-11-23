import java.util.Arrays;
import java.util.Scanner;

public class StudentGroup {
	private StudentInfo[] group;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public StudentInfo[] getGroup() {
		return group;
	}

	public void setGroup(StudentInfo[] group) {
		this.group = group;
	}

	public StudentGroup() {
		// TODO Auto-generated constructor stub
		group = null;
		size = 0;
	}

	public StudentGroup(int size) {
		group = new StudentInfo[size];
		this.size = 0;
	}

	public StudentGroup(StudentInfo[] group) {
		super();
		this.group = group;
		size = group.length;
	}

	public void Add(StudentInfo st) {
		if (size == group.length) {
			return;
		}
		group[size++] = st;
	}

	public void Delete(int index) {
		if (index == size || index == -1) {
			return;
		}
		for (int i = index; i < size - 1; i++) {
			group[i] = group[i + 1];
		}
		size--;
	}

	public void DeleteStudent(int fnom) {
		Delete(findStudent(fnom));
	}

	public void DeleteFirstStudent(String ime) {
		Delete(findStudent(ime, 0));
	}

	public void DeleteAllStudents(String ime) {
		int index=0;
		do {
			index = findStudent(ime,index);
			DeleteStudent(index);
		} while (index != -1);
	}

	public int findStudent(int fnom) {
		for (int i = 0; i < size; i++) {
			if (group[i].getFnom() == fnom)
				return i;
		}
		return -1;
	}

	public int findStudent(String ime, int startIndex) {
		for (int i = startIndex; i < size; i++) {
			if (group[i].getName() == ime)
				return i;
		}
		return -1;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of students: ");
		int number = sc.nextInt();
		if (number < 1)
			return;
		group = new StudentInfo[number];
		for (int i = 0; i < number; i++) {
			Add(StudentInfo.input());
		}
	}

	@Override
	public String toString() {
		return "StudentGroup [group=" + Arrays.toString(group) + ", size="
				+ size + "]";
	}

}
