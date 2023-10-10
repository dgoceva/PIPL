
public class Student {
	private int facNum;
	private String name;
	private double mark;
	@Override
	public String toString() {
		return "Student [facNum=" + facNum + ", name=" + name + ", mark=" + mark + "]";
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
	public Student(int facNum, String name, double mark) {
		super();
		this.facNum = facNum;
		this.name = name;
		this.mark = mark;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
