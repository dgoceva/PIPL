
public class Student extends Person{
	private int facNum;
	private double mark;
	
	@Override
	public String toString() {
		return "Student [facNum=" + facNum + ", name=" + name + ", mark=" + mark + "]";
	}

	public Student(int facNum, String name, double mark) {
		super(name);
		this.facNum = facNum;
//		this.name = name;
		this.mark = mark;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFacNum() {
		return facNum;
	}

	public void setFacNum(int facNum) {
		this.facNum = facNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
}
