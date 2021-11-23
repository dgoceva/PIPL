import java.util.Objects;

public class StudentComparable implements Comparable<StudentComparable> {
	private int number;
	private String name;
	private float mark;

	
	public StudentComparable(int number, String name, float mark) {
		super();
		this.number = number;
		this.name = name;
		this.mark = mark;
	}


	public StudentComparable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMark() {
		return mark;
	}


	public void setMark(float mark) {
		this.mark = mark;
	}


	@Override
	public String toString() {
		return "StudentComparable [number=" + number + ", name=" + name + ", mark=" + mark + "]";
	}


	@Override
	public int compareTo(StudentComparable o) {
		// TODO Auto-generated method stub
		if (mark==o.mark) {
			return 0;
		} else if (mark>o.mark) {
			return -1;
		}
		return 1;
	}

}
