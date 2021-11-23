import java.util.ArrayList;
import java.util.Scanner;


public class StudentGroupList {
	private ArrayList<StudentInfo> group;
	public void Add(StudentInfo st) {
		group.add(st);
	}

	public void Delete(int index) {
		group.remove(index);
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
			Delete(index);
		} while (index != -1);
	}

	public int findStudent(int fnom){
		for (int i=0;i<group.size();i++)
			if (group.get(i).getFnom()==fnom)
				return i;
		return -1;
	}

	public int findStudent(String ime, int startindex){
		for (int i=startindex;i<group.size();i++)
			if (group.get(i).getName()==ime)
				return i;
		return -1;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of students: ");
		int number = sc.nextInt();
		if (number < 1)
			return;
		group = new ArrayList<StudentInfo>();
		for (int i = 0; i < number; i++) {
			group.add(StudentInfo.input());
		}
	}

	@Override
	public String toString() {
		return "StudentGroupList [group=" + group + "]";
	}

}

