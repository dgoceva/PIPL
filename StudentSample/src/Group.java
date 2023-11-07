import java.util.ArrayList;
import java.util.List;

public class Group {
	private int number;
	private String specialty;
	private int course;
	private List<Student> students;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Group() {
		super();
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
	}
	public Group(int number, String specialty, int course, List<Student> students) {
		super();
		this.number = number;
		this.specialty = specialty;
		this.course = course;
		this.students = students;
	}
	@Override
	public String toString() {
		return "Group [number=" + number + ", specialty=" + specialty + ", course=" + course + ", students=" + students
				+ "]";
	}
	
}
