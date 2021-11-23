import java.util.Comparator;

public class Student {
	private int number;
	private String name;
	private float mark;

	
	public Student(int number, String name, float mark) {
		super();
		this.number = number;
		this.name = name;
		this.mark = mark;
	}


	public Student() {
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
		return "Student [number=" + number + ", name=" + name + ", mark=" + mark + "]";
	}

}

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SortByNumber implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getNumber()-o2.getNumber();
	}
	
}

class SortByMark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getMark()==o2.getMark()) {
			return 0;
		}else if (o1.getMark()>o2.getMark()) {
			return -1;
		}
		return 1;
	}
	
}