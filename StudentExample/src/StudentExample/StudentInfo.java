package StudentExample;

public class StudentInfo {
	private int fnom;
	private String ime;
	private double avmark;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public StudentInfo(int fnom, String ime, double avmark) {
		super();
		this.fnom = fnom;
		this.ime = ime;
		this.avmark = avmark;
	}


	public int getFnom() {
		return fnom;
	}


	public void setFnom(int fnom) {
		this.fnom = fnom;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public double getAvmark() {
		return avmark;
	}


	public void setAvmark(double avmark) {
		this.avmark = avmark;
	}


	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}

}
