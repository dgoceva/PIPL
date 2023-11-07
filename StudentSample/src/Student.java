import java.util.ArrayList;
import java.util.List;

public class Student {
	private int fNumber;
	private String name;
//	private Mark[] marks;
	private List<Mark> marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mark> getMarks() {
		return marks;
	}
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
	public int getfNumber() {
		return fNumber;
	}
	private Student() {
		super();
		// TODO Auto-generated constructor stub
		marks = new ArrayList<Mark>();
	}
	public Student(int fNumber, String name) {
		super();
		this.fNumber = fNumber;
		this.name = name;
		marks = new ArrayList<Mark>();
	}
	@Override
	public String toString() {
		return "Student [fNumber=" + fNumber + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
