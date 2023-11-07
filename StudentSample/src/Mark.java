import java.util.Date;

public class Mark {
	private String subject;
	private double mark;
	private Date dateOfExam;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public Date getDateOfExam() {
		return dateOfExam;
	}
	public void setDateOfExam(Date dateOfExam) {
		this.dateOfExam = dateOfExam;
	}
	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mark(String subject, double mark, Date dateOfExam) {
		super();
		this.subject = subject;
		this.mark = mark;
		this.dateOfExam = dateOfExam;
	}
	@Override
	public String toString() {
		return "Mark [subject=" + subject + ", mark=" + mark + ", dateOfExam=" + dateOfExam + "]";
	}
	
}
