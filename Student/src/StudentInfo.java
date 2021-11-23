import java.util.*;

public class StudentInfo {
	private int fnom;
	private String name;
	private double avmark;

	public int getFnom() {
		return fnom;
	}

	public void setFnom(int fnom) {
		this.fnom = fnom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvmark() {
		return avmark;
	}

	public void setAvmark(double avmark) {
		this.avmark = avmark;
	}

	public StudentInfo() {
		// TODO Auto-generated constructor stub
		fnom = 0;
		name = "";
		avmark = 0;
	}

	public StudentInfo(int fnom, String name, double avmark) {
		super();
		this.fnom = fnom;
		this.name = name;
		this.avmark = avmark;
	}

	public static StudentInfo input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input faculty number: ");
		int fnom = sc.nextInt();
		System.out.print("Input name: ");
		String name = sc.next();
		System.out.print("Input average makr: ");
		double avmark = sc.nextDouble();
		return new StudentInfo(fnom, name, avmark);
	}

	@Override
	public String toString() {
		return "StudentInfo [avmark=" + avmark + ", fnom=" + fnom + ", name="
				+ name + "]";
	}
}
